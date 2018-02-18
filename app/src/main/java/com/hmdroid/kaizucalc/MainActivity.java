package com.hmdroid.kaizucalc;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    EditText jpy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("日本円から貝塚円");
        setSupportActionBar(toolbar);
    }

    public void kaizuka(View view) {
        jpy = findViewById(R.id.jpy);
        if(jpy.getText().toString().equals("")){
            Toast.makeText(this,"何か入力するだで。",Toast.LENGTH_SHORT);
        }else {
            BigInteger j = new BigInteger(jpy.getText().toString());
            BigInteger big3 = new BigInteger("35");
            double k = j.multiply(big3).doubleValue();

            AlertDialog.Builder alert01 = new AlertDialog.Builder(this);
            alert01.setTitle("警告:");
            alert01.setMessage(k + "貝塚円");
            alert01.show();
        }
    }
}
