package com.example.dost

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserId : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_id)

        val cont = findViewById<Button>(R.id.contbtn)

        cont.setOnClickListener {
            val i = Intent(this, EmailId::class.java)
            startActivity(i)
        }
    }
}