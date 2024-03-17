package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class onboard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)

        val skip_btn1 : TextView = findViewById(R.id.skip_btn1)

        skip_btn1.setOnClickListener {
            val intent = Intent(this, Screen::class.java)
            startActivity(intent)
        }

        val navibtn : ImageView = findViewById(R.id.navibtn1)
        navibtn.setOnClickListener {
            val intent = Intent(this, Onbord02::class.java)
            startActivity(intent)
        }
    }
}