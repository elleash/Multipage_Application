package com.example.multipageapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import android.widget.TextView

class tulips : AppCompatActivity() {

    private lateinit var backBtn: ImageButton
    private lateinit var symbolBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tulips)

        backBtn = findViewById(R.id.back2)
        symbolBtn = findViewById(R.id.symbBtn)

        backBtn.setOnClickListener {
            val intent = Intent(this, decoflowers::class.java)
            startActivity(intent)
        }

        symbolBtn.setOnClickListener {

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.activity_symbolism, null)
            popupView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in_two))

            val newTxt = popupView.findViewById<TextView>(R.id.symbText)
            newTxt.text = "Tulips are a popular flower that represents love alongside roses.\n" +
                    "This flower symbolizes deep love, rebirth and charity."

            val width = 1300
            val height = 2000

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,1,1)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
    }
}