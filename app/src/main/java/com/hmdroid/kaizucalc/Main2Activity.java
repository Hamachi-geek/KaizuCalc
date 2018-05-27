package com.hmdroid.kaizucalc;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;


public class Main2Activity extends AppCompatActivity {
    EditText kaizuka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void japan(View view) {
        kaizuka = findViewById(R.id.kaizuka);
        if (kaizuka.getText().toString().equals("")) {
            Snackbar.make(view, "何か入力するだで", Snackbar.LENGTH_SHORT).show();
        } else {
            BigDecimal k = new
                    BigDecimal(kaizuka.getText().toString());
            //35を掛け算(少数が計算結果になることがあるためBigDecimal)
            BigDecimal big3 = new BigDecimal("35");
            double j = k.divide(big3, 3, ROUND_HALF_UP).doubleValue();

            AlertDialog.Builder alert01 = new AlertDialog.Builder(this);
            alert01.setTitle("警告:");
            alert01.setMessage(j + "円");
            alert01.show();
        }
    }
}
