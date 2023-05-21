package com.example.dost

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EmailId : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_id)

        val agreebtn = findViewById<Button>(R.id.agree)

        agreebtn.setOnClickListener {
            val intent = Intent(this, Password::class.java)
            startActivity(intent)
        }
    }
}