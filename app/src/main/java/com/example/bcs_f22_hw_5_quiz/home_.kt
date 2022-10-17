package com.example.bcs_f22_hw_5_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home_ : AppCompatActivity() {

    lateinit var mbtnPlay:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        mbtnPlay = findViewById(R.id.btnPlay)



        mbtnPlay.setOnClickListener { val intent = Intent(this, Q1::class.java)
        startActivity(intent)
        }



    }
}