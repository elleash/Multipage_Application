package com.example.multipageapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {


    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var beginBtn: ImageButton
    private lateinit var editText: EditText
    private lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        beginBtn = findViewById(R.id.proceedBtn)
        saveBtn = findViewById(R.id.saveBtn)
        editText = findViewById(R.id.userEntry)
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        saveBtn.setOnClickListener {
            val inputText = editText.text.toString()
            val editor = sharedPreferences.edit()
            editor.putString("text", inputText)
            editor.apply()
        }

        beginBtn.setOnClickListener {
            val intent = Intent(this, mainview::class.java)
            startActivity(intent)

        }
    }
}