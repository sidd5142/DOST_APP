package com.example.dost

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Password : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        val agreebtn = findViewById<Button>(R.id.Agreejoin)

        agreebtn.setOnClickListener {
            val intent = Intent(this, Content::class.java)
            startActivity(intent)
        }
    }
}