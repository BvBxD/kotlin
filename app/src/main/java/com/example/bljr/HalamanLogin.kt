package com.example.bljr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.bljr.databinding.ActivityHalamanLoginBinding

class HalamanLogin : AppCompatActivity() {

    private lateinit var binding : ActivityHalamanLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnLogin1.setOnClickListener {
            val login = Intent(this, Home::class.java);
            startActivity(login)
        }
        binding.btnCancel.setOnClickListener {
            val cancel = Intent(this, MainActivity::class.java);
            startActivity(cancel)
        }
    }
}