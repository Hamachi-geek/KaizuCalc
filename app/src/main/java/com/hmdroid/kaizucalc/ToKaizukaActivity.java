package com.hmdroid.kaizucalc;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;


import java.math.BigInteger;

public class ToKaizukaActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_kaizuka);

        //ToolBar
        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle (R.string.yen2kaizuka);
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
                        //35を割り算(整数が計算結果になるためBigInteger)
                        BigInteger bigInteger = new BigInteger(editText.getText().toString());
                        BigInteger bigInteger35 = new BigInteger("35");
                        double result = bigInteger.multiply(bigInteger35).longValue();

                        AlertDialog.Builder alert01 = new AlertDialog.Builder(ToKaizukaActivity.this);
                        alert01.setTitle("警告:");
                        alert01.setMessage(result + "貝塚円");
                        alert01.show();
                    }

                }
                return false;
            }
        });
    }
}