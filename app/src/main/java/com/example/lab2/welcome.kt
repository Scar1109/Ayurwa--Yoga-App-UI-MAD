package com.example.lab2
import android.os.Handler
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper


class welcome : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        handler.postDelayed({
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        },2500L)
    }

}