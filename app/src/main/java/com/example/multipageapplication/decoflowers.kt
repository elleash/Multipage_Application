package com.example.multipageapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageButton

class decoflowers : AppCompatActivity() {

    private lateinit var tulipsBtn: ImageButton
    private lateinit var peonyBtn: ImageButton
    private lateinit var dahliasBtn: ImageButton
    private lateinit var prevBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decoflowers)

        tulipsBtn = findViewById(R.id.decorImg1)
        peonyBtn = findViewById(R.id.decorImg2)
        dahliasBtn = findViewById(R.id.decorImg3)
        prevBtn = findViewById(R.id.back1)

        tulipsBtn.setOnClickListener {
            val intent = Intent(this, tulips::class.java)
            startActivity(intent)
            tulipsBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        peonyBtn.setOnClickListener {
            val intent = Intent(this, peony::class.java)
            startActivity(intent)
            peonyBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        dahliasBtn.setOnClickListener {
            val intent = Intent(this, dahlias::class.java)
            startActivity(intent)
            dahliasBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }

        prevBtn.setOnClickListener {
            val intent = Intent(this, mainview::class.java)
            startActivity(intent)
        }
    }
}