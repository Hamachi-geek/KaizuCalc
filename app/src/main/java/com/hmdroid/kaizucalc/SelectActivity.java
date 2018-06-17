package com.hmdroid.kaizucalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

    }
    public void toKaizuka(View view){
        Intent intent = new Intent(this,ToKaizukaActivity.class);
        startActivity(intent);
    }
    public void toYen(View view){
        Intent intent = new Intent(this,ToYenActivity.class);
        startActivity(intent);
    }
    public void about(View view){
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
}
