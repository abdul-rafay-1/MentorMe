package com.AbdulRafay.i212582


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


class BookSession : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_session)

        val imgbtn: ImageButton = findViewById(R.id.imageButton7)
        imgbtn.setOnClickListener{
            onBackPressed()
        }

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            startActivity(Intent(this,ReviewFeedback::class.java))
        }

        val btn1: Button = findViewById(R.id.button3)
        btn1.setOnClickListener {
            startActivity(Intent(this,BookAppointment::class.java))
        }
    }
}