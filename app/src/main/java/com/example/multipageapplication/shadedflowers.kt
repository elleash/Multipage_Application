package com.example.multipageapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageButton

class shadedflowers : AppCompatActivity() {

    private lateinit var impatiensBtn: ImageButton
    private lateinit var snowdropsBtn: ImageButton
    private lateinit var bellflowerBtn: ImageButton
    private lateinit var prevBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shadedflowers)

        impatiensBtn = findViewById(R.id.shadedImg1)
        snowdropsBtn = findViewById(R.id.shadedImg2)
        bellflowerBtn = findViewById(R.id.shadedImg3)
        prevBtn = findViewById(R.id.back1)


        impatiensBtn.setOnClickListener {
            val intent = Intent(this, impatiens::class.java)
            startActivity(intent)
            impatiensBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        snowdropsBtn.setOnClickListener {
            val intent = Intent(this, snowdrops::class.java)
            startActivity(intent)
            snowdropsBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        bellflowerBtn.setOnClickListener {
            val intent = Intent(this, bellflower::class.java)
            startActivity(intent)
            bellflowerBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        prevBtn.setOnClickListener {
            val intent = Intent(this, mainview::class.java)
            startActivity(intent)
        }
    }
}