package com.example.multipageapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class splashscreen : AppCompatActivity() {

    // splash screen duration
    private val SPLASH_TIME_OUT: Long = 3000
    private lateinit var textAnim: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        // added splash screen to app
        android.os.Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)

        textAnim = findViewById(R.id.appName)

        // added animation to app name
        val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        textAnim.startAnimation(animation)
    }
}
