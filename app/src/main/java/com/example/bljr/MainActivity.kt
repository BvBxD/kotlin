package com.example.bljr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.bljr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       binding.btnLogin.setOnClickListener {
           val login = Intent(this,HalamanLogin::class.java);
           startActivity(login)
       }
        binding.ivKeluar.setOnClickListener {
            finishAffinity()
        }
    }
}