package com.hmdroid.kaizucalc

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class SelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
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