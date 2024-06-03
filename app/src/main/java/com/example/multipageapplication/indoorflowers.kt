package com.example.multipageapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageButton

class indoorflowers : AppCompatActivity() {

    private lateinit var amaryllisBtn: ImageButton
    private lateinit var oxalisBtn: ImageButton
    private lateinit var capeBtn: ImageButton
    private lateinit var prevBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indoorflowers)

        amaryllisBtn = findViewById(R.id.indoorImg1)
        oxalisBtn = findViewById(R.id.indoorImg2)
        capeBtn = findViewById(R.id.indoorImg3)
        prevBtn = findViewById(R.id.back1)

        amaryllisBtn.setOnClickListener {
            val intent = Intent(this, amaryllis::class.java)
            startActivity(intent)
            amaryllisBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        oxalisBtn.setOnClickListener {
            val intent = Intent(this, oxalis::class.java)
            startActivity(intent)
            oxalisBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        capeBtn.setOnClickListener {
            val intent = Intent(this, capeprimrose::class.java)
            startActivity(intent)
            capeBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }

        prevBtn.setOnClickListener {
            val intent = Intent(this, mainview::class.java)
            startActivity(intent)
        }
    }
}