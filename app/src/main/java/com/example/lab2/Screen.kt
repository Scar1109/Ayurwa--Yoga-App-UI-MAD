package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)


        val login_bt2: TextView = findViewById(R.id.login_bt2)

        login_bt2.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val button3: TextView = findViewById(R.id.button3)

        button3.setOnClickListener {
            val intent = Intent(this,signup ::class.java)
            startActivity(intent)
        }
    }
}