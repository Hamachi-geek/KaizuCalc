package com.hmdroid.kaizucalc

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View

class AboutActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    fun x(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/syamu_tweet"))
        startActivity(intent)
    }

    fun tiktok(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tiktok.com/@syamu_tweet"))
        startActivity(intent)
    }
    fun nicovideo(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nicovideo.jp/user/126799414"))
        startActivity(intent)
    }

    fun youtube(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@user-syamu_YouTube"))
        startActivity(intent)
    }

    fun privacy(view: View?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://hamachi.osaka/posts/PrivacyPolicy_KaizuCalc/"))
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