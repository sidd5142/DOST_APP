package com.example.dost

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Sign_Up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn1 = findViewById<Button>(R.id.button)
        val signIn = findViewById<Button>(R.id.SignIn)


        btn1.setOnClickListener {
            val intent = Intent(this,UserId::class.java)
            startActivity(intent)
        }
       signIn.setOnClickListener {
           val i = Intent(this, Sign_in::class.java)
           startActivity(i)
       }
    }
}