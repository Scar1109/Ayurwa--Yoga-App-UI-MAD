package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login : Button = findViewById(R.id.login_bt)
        login.setOnClickListener {
            val intent= Intent(this,welcome::class.java)
            startActivity(intent)
        }


        }
    }
