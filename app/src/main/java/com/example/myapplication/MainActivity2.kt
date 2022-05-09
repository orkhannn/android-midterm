package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val backBtn = findViewById<Button>(R.id.button2);

        val name = intent.extras?.getString("name", "");
        findViewById<TextView>(R.id.textView2).text = "Welcome, $name";

        backBtn.setOnClickListener {
            finish()

        }

    }
}