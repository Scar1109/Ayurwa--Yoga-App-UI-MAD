package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signup_bt0 : TextView = findViewById(R.id.signup_bt0)


        signup_bt0.setOnClickListener {
            val intent = Intent(  this,welcome::class.java)
            startActivity(intent)
        }
    }
}