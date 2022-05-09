package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTxt = findViewById<EditText>(R.id.editTextTextPersonName);
        val profileBtn = findViewById<ImageButton>(R.id.imageButton);
        val nextBtn = findViewById<Button>(R.id.Profilebutton)


        nextBtn.setOnClickListener {
            val name = editTxt.text.toString();
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", name);
            startActivity(intent);

        }

        profileBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", "stranger");
            startActivity(intent);

        }
    }
}