package com.example.bljr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logout = findViewById<ImageView>(R.id.iv_logout);
        logout.setOnClickListener {
            val keluar = Intent(this, MainActivity::class.java);
            startActivity(keluar)
        }
    }
}