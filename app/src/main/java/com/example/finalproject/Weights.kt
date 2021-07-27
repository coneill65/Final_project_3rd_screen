package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Weights : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weights_activity)

        val btnProfile = findViewById<Button>(R.id.prevBtnPage3)
        btnProfile.setOnClickListener{

            val intent = Intent(this, Screen2::class.java)
            startActivity(intent)
        }
    }
}