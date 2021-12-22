package com.hmdroid.kaizucalc;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;


public class ToYenActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_yen);

        //ToolBar
        Toolbar toolbar=findViewById(R.id.toolbar2);
        toolbar.setTitle (R.string.convert_yen);
        setSupportActionBar(toolbar);

        //EditText
        editText = findViewById(R.id.editText);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    if (editText.getText().toString().equals("")) {
                        Snackbar.make(v, "何か入力するだで", Snackbar.LENGTH_SHORT).show();
                    } else {

                        BigDecimal bigDecimal = new
                                BigDecimal(editText.getText().toString());
                        //35を掛け算(少数が計算結果になることがあるためBigDecimal)
                        BigDecimal bigDecimal35 = new BigDecimal("35");
                        double j = bigDecimal.divide(bigDecimal35, 3, ROUND_HALF_UP).longValue();

                        AlertDialog.Builder alert01 = new AlertDialog.Builder(ToYenActivity.this);
                        alert01.setTitle("警告:");
                        alert01.setMessage(j + "円");
                        alert01.show();
                    }


                }
                return false;
            }
        });

        }

    }
