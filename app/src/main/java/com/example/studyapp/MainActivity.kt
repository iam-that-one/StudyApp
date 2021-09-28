package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var goToKotilnTopic : Button
    lateinit var goToAndroidTopic: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToKotilnTopic = findViewById(R.id.button)
        goToAndroidTopic = findViewById(R.id.button3)

        goToKotilnTopic.setOnClickListener{
            var intent = Intent(this,KotlinActivity::class.java)
            startActivity(intent)
        }
        goToAndroidTopic.setOnClickListener{
            var intent = Intent(this,AndroidActivity::class.java)
            startActivity(intent)
        }
    }
}