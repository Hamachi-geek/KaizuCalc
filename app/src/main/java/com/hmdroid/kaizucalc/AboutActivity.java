package com.hmdroid.kaizucalc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void atwiki (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www63.atwiki.jp/syamugame/"));
        startActivity(intent);
    }
    public void off_zero (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Iag55pIKWzI"));
        startActivity(intent);
    }
    public void syamu_youtube (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCndPTRRme85svqTEhT14-Iw"));
        startActivity(intent);
    }
    public void syamu_twitter (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/syamudesuyo"));
        startActivity(intent);
    }
    public void android_asset_studio (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://romannurik.github.io/AndroidAssetStudio/icons-launcher.html"));
        startActivity(intent);
    }
    public void github (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/HamaDroid/KaizuCalc/"));
        startActivity(intent);
    }
}
