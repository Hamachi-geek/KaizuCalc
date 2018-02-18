package com.hmdroid.kaizucalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle("KaizuCalc");
    }
    public void kaizukayen(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void nihonyen(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void about(View view){
        Intent intent = new Intent(this,about.class);
        startActivity(intent);
    }
}
