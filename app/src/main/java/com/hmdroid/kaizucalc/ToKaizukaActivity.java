package com.hmdroid.kaizucalc;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AlertDialog;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;


import java.math.BigInteger;
import java.text.DecimalFormat;

public class ToKaizukaActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AppCompat_DayNight_NoActionBar);
        setContentView(R.layout.activity_to_yen);

        //EditText
        editText = findViewById(R.id.editText);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    if (editText.getText().toString().equals("")) {
                        Snackbar.make(v, "何か入力するだで", Snackbar.LENGTH_SHORT).show();
                    } else {
                        //35を割り算(整数が計算結果になるためBigInteger)
                        BigInteger bigInteger = new BigInteger(editText.getText().toString());
                        BigInteger bigInteger35 = new BigInteger("35");
                        double result = bigInteger.multiply(bigInteger35).longValue();
                        System.out.println("Double Value: "+ result);
                        String kaizuka = String.format("%,.0f", result);
                        System.out.println("Value after Formatting: "+ kaizuka);

                        //Result Dialog
                        AlertDialog.Builder alert01 = new AlertDialog.Builder(ToKaizukaActivity.this);
                        alert01.setTitle("警告:");
                        alert01.setMessage(kaizuka + "貝塚円");
                        alert01.setPositiveButton("SHARE", (dialog, which) -> {
                            Intent share = new Intent();
                            share.setAction(Intent.ACTION_SEND);
                            share.putExtra(Intent.EXTRA_TEXT, kaizuka + "貝塚円");
                            share.setType("text/plain");
                            Intent shareIntent = Intent.createChooser(share, kaizuka + "貝塚円");
                            startActivity(shareIntent);
                        });
                        final AlertDialog alert = alert01.create();
                        alert01.show();
                    }

                }
                return false;
            }
        });
    }
}