package com.hmdroid.kaizucalc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.View
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SelectActivity : AppCompatActivity(R.layout.activity_select) {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        setTheme(R.style.Theme_AppCompat_Light_NoActionBar)
        super.onCreate(savedInstanceState)
    }

    fun toKaizuka(view: View?) {
        val intent = Intent(this, ToKaizukaActivity::class.java)
        startActivity(intent)
    }

    fun toYen(view: View?) {
        val intent = Intent(this, ToYenActivity::class.java)
        startActivity(intent)
    }

    fun about(view: View?) {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}