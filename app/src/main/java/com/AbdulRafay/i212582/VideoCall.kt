package com.AbdulRafay.i212582

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class VideoCall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_call)

        val img:ImageView = findViewById(R.id.img1)
        img.setOnClickListener{
            onBackPressed()
        }

        val img2:ImageView = findViewById(R.id.img2)
        img2.setOnClickListener{
            onBackPressed()
        }

    }
}