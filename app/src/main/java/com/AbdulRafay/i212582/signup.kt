package com.AbdulRafay.i212582

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)

        val txt: TextView = findViewById(R.id.textView22)
        txt.setOnClickListener {
            startActivity(Intent(this,login::class.java))
        }

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener {
            startActivity(
                Intent(this,VerifyNumber::class.java)
            )
        }

    }
}