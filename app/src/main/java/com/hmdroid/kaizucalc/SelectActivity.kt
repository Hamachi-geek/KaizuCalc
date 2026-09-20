package com.hmdroid.kaizucalc

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Handle the splash screen transition.
        installSplashScreen()

        enableEdgeToEdge()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
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
