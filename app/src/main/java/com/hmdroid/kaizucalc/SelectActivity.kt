package com.hmdroid.kaizucalc

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Handle the splash screen transition.
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

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