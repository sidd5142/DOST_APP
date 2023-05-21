package com.example.dost

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Sign_in : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btn = findViewById<TextView>(R.id.forget)
        val btn1 = findViewById<Button>(R.id.contbutton)
     //   val btn2 = findViewById<Button>(R.id.join)

        btn.setOnClickListener {
            val i = Intent(this, Password::class.java)
            startActivity(i)
        }

        btn1.setOnClickListener {
            val i = Intent(this, Content::class.java)
            startActivity(i)
        }

        /*btn2.setOnClickListener {
            val i = Intent(this, Sign_Up::class.java)
            startActivity(i)
        }*/
    }
}