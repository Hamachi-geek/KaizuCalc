package com.hmdroid.kaizucalc

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    fun atwiki(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www63.atwiki.jp/syamugame/"))
        startActivity(intent)
    }

    fun off_zero(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Iag55pIKWzI"))
        startActivity(intent)
    }

    fun syamu_youtube(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCndPTRRme85svqTEhT14-Iw"))
        startActivity(intent)
    }

    fun syamu_twitter(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/syamu_net"))
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