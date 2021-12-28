package com.example.minutes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
  private lateinit var  b1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1=findViewById(R.id.b1)
        b1.setOnClickListener {
            val i=Intent(this,MainActivity2::class.java)
            startActivity(i)
        }
    }
}

