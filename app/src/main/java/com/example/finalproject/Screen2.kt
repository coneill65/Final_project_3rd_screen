package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val btnProfile = findViewById<Button>(R.id.prevBtnPage2)
        btnProfile.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        val btnProfile2 = findViewById<Button>(R.id.nextBtnPage2)
        btnProfile2.setOnClickListener{

            val intent = Intent(this, Weights::class.java)
            startActivity(intent)

        }
    }
}