package com.example.multipageapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout

class mainview : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var shadedImgBtn: ImageButton
    private lateinit var pottedImgBtn: ImageButton
    private lateinit var indoorImgBtn: ImageButton
    private lateinit var decoImgBtn: ImageButton
    private lateinit var informBtn: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainview)

        textView = findViewById(R.id.greeting)
        shadedImgBtn = findViewById(R.id.shadedImg)
        pottedImgBtn = findViewById(R.id.pottedImg)
        indoorImgBtn = findViewById(R.id.indoorImg)
        decoImgBtn = findViewById(R.id.decoImg)
        informBtn = findViewById(R.id.infoBtn)

        // display user's input
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val text = sharedPreferences.getString("text", "")
        textView.text = "HELLO,\n$text"

        // opens the flower's assigned classification
        // added animations on click
        shadedImgBtn.setOnClickListener {
            val intent = Intent(this, shadedflowers::class.java)
            startActivity(intent)
            shadedImgBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        pottedImgBtn.setOnClickListener {
            val intent = Intent(this, pottedflowers::class.java)
            startActivity(intent)
            pottedImgBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        indoorImgBtn.setOnClickListener {
            val intent = Intent(this, indoorflowers::class.java)
            startActivity(intent)
            indoorImgBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }
        decoImgBtn.setOnClickListener {
            val intent = Intent(this, decoflowers::class.java)
            startActivity(intent)
            decoImgBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_two))
        }

        // button to show waht the app is about
        informBtn.setOnClickListener {

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.activity_information, null)
            popupView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in))

            val width = 1300
            val height = 2500

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,1,1)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
         // added animation to the button
        informBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bounce))
    }


}
