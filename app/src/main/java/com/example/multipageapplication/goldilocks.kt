package com.example.multipageapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import android.widget.TextView

class goldilocks : AppCompatActivity() {

    private lateinit var backBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goldilocks)

        backBtn = findViewById(R.id.back2)

        backBtn.setOnClickListener {
            val intent = Intent(this, pottedflowers::class.java)
            startActivity(intent)
        }
    }
}