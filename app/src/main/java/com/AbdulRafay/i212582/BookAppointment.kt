package com.AbdulRafay.i212582


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast


class BookAppointment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_appointment)

        val imgbtn: ImageButton = findViewById(R.id.imageButton7)
        imgbtn.setOnClickListener{
            onBackPressed()
        }

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener{
            Toast.makeText(it.context, "Appointment Booked...", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainMenu::class.java))
        }
    }
}