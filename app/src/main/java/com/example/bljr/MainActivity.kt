package com.example.bljr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<Button>(R.id.btn_login)
        login.setOnClickListener {
            val pindah = Intent(this, HalamanLogin::class.java);
            startActivity(pindah)
        }
        val logout = findViewById<ImageView>(R.id.iv_keluar);
        logout.setOnClickListener {
            finishAffinity()
        }
    }
}