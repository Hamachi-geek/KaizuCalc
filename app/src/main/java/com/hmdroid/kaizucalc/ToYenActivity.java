package com.hmdroid.kaizucalc;

import static java.math.BigDecimal.ROUND_HALF_UP;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.math.BigDecimal;

public class ToYenActivity extends Activity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_yen);

        //EditText
        editText = findViewById(R.id.editText);
        editText.setOnEditorActionListener(new OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    if (editText.getText().toString().equals("")) {
                        Snackbar.make(v, "何か入力するだで", Snackbar.LENGTH_SHORT).show();
                    } else {

                        BigDecimal bigDecimal = new
                                BigDecimal(editText.getText().toString());
                        //35を掛け算(少数が計算結果になることがあるためBigDecimal)
                        BigDecimal bigDecimal35;
                        bigDecimal35 = new BigDecimal("35");
                        double result = bigDecimal.divide(bigDecimal35, 3, ROUND_HALF_UP).longValue();
                        System.out.println("Double Value: "+ result);
                        String jpy = String.format("%,.0f", result);
                        System.out.println("Value after Formatting: "+ jpy);
                        AlertDialog.Builder alert01 = new AlertDialog.Builder(ToYenActivity.this);
                        alert01.setTitle("警告:");
                        alert01.setMessage(jpy + "円");
                        alert01.setPositiveButton("SHARE", (dialog, which) -> {
                            Intent share = new Intent();
                            share.setAction(Intent.ACTION_SEND);
                            share.putExtra(Intent.EXTRA_TEXT, jpy + "円");
                            share.setType("text/plain");
                            Intent shareIntent = Intent.createChooser(share, jpy + "円");
                            startActivity(shareIntent);
                        });
                        final AlertDialog alert = alert01.create();
                        alert01.show();
                    }
                }
                return true;
            }
        });

        }

    }
