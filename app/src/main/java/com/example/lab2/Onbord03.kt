package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Onbord03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onbord03)

        val navi3: TextView = findViewById(R.id.Start_bt)

        navi3.setOnClickListener {
            val intent = Intent(this, Screen::class.java)
            startActivity(intent)
        }
    }
}