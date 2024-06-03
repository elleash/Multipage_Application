package com.example.multipageapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageButton

class pottedflowers : AppCompatActivity() {

    private lateinit var asterBtn: ImageButton
    private lateinit var goldilocksBtn: ImageButton
    private lateinit var coleusBtn: ImageButton
    private lateinit var prevBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pottedflowers)

        asterBtn = findViewById(R.id.pottedImg1)
        goldilocksBtn = findViewById(R.id.pottedImg2)
        coleusBtn = findViewById(R.id.pottedImg3)
        prevBtn = findViewById(R.id.back1)

        asterBtn.setOnClickListener {
            val intent = Intent(this, purpleasters::class.java)
            startActivity(intent)
            asterBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        goldilocksBtn.setOnClickListener {
            val intent = Intent(this, goldilocks::class.java)
            startActivity(intent)
            goldilocksBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }

        coleusBtn.setOnClickListener {
            val intent = Intent(this, coleusFlower::class.java)
            startActivity(intent)
            coleusBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }

        prevBtn.setOnClickListener {
            val intent = Intent(this, mainview::class.java)
            startActivity(intent)
        }
    }
}