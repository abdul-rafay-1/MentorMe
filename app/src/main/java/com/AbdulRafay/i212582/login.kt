package com.AbdulRafay.i212582

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView


class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val txt:TextView = findViewById(R.id.textView9)
        txt.setOnClickListener {
            startActivity(Intent(this,signup::class.java))
        }

    }
}