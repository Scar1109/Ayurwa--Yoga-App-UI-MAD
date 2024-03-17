package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_2 -> {
                    val intent = Intent(this, Progress::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_3 -> {
                    val intent = Intent(this, Music::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_4 -> {
                    true
                }
                else -> false
            } }

        val upprofil: Button = findViewById(R.id.update)
        upprofil.setOnClickListener {
            val intent = Intent(  this,updateinfo::class.java)
            startActivity(intent)
        }

        val logout : ImageView = findViewById(R.id.logout)

        logout.setOnClickListener{
            val intent = Intent(this,Screen::class.java)
            startActivity(intent)
        }

    }
}