package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Onbord02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onbord02)

        val skip_bt2 : TextView = findViewById(R.id.skip_bt2)

        skip_bt2.setOnClickListener {
            val intent = Intent(this, Screen::class.java)
            startActivity(intent)
        }

        val navi_2 : ImageView = findViewById(R.id.on3navi)

        navi_2.setOnClickListener {
            val intent = Intent(this, Onbord03::class.java)
            startActivity(intent)
        }
    }
}