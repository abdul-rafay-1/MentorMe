package com.AbdulRafay.i212582

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class VerifyNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.verify_number)

        val imgbtn: ImageButton = findViewById(R.id.imageView3)

        imgbtn.setOnClickListener{
            startActivity(Intent(this,signup::class.java))
        }

    }
}