package com.example.bljr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.bljr.databinding.ActivitySplashScreenBinding

class Splash_Screen : AppCompatActivity() {
    //deklarasi variable

    private var splashTimeOut: Long = 3000
    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Handler().postDelayed({
            val intent = Intent(this@Splash_Screen, MainActivity::class.java)
            startActivity(intent)

            finish()
        },splashTimeOut)
    }
}