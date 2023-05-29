package com.example.bljr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HalamanLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_login)

        val email = findViewById<EditText>(R.id.et_email);
        val password = findViewById<EditText>(R.id.et_pass);
        val login = findViewById<Button>(R.id.btn_login1);
        login.setOnClickListener {
            val pindah = Intent(this, Home::class.java);
            startActivity(pindah)
        }
       val cancel = findViewById<Button>(R.id.btn_cancel);
       cancel.setOnClickListener {
           val kembali = Intent(this, MainActivity::class.java);
           startActivity(kembali)
       }
    }
}