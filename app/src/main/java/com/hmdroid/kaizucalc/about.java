package com.hmdroid.kaizucalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar=findViewById(R.id.toolbar6);
        toolbar.setTitle("このアプリについて　");
        setSupportActionBar(toolbar);
    }
}
