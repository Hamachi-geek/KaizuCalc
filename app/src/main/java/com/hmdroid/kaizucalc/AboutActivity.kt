package com.hmdroid.kaizucalc

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.View

class AboutActivity : AppCompatActivity (R.layout.activity_about) {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
    }

    fun atwiki(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www63.atwiki.jp/syamugame/"))
        startActivity(intent)
    }

    fun off_zero_youtube(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/zZCmMY__Rk8"))
        startActivity(intent)
    }
    fun off_zero_nicovideo(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nicovideo.jp/watch/sm29389990"))
        startActivity(intent)
    }

    fun android_asset_studio(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://romannurik.github.io/AndroidAssetStudio/icons-launcher.html"))
        startActivity(intent)
    }

    fun github(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/HamaDroid/KaizuCalc/"))
        startActivity(intent)
    }
}