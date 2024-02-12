package com.AbdulRafay.i212582

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView


class ChatsLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chats_layout)

        val imgbtn: ImageButton = findViewById(R.id.imageButton7)
        imgbtn.setOnClickListener{
            onBackPressed()
        }

        val img2: ImageView = findViewById(R.id.imageView13)
        img2.setOnClickListener{
            startActivity(Intent(this,CommunityLayout::class.java))
        }

        val txt1:TextView = findViewById(R.id.textView7)
        val txt2:TextView = findViewById(R.id.textView3)
        val img:ImageView = findViewById(R.id.imageView19)

        txt1.setOnClickListener {
            startActivity(Intent(this, JohnCooperChat::class.java))
        }
        txt2.setOnClickListener {
            startActivity(Intent(this, JohnCooperChat::class.java))
        }
        img.setOnClickListener {
            startActivity(Intent(this, JohnCooperChat::class.java))
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_app_bar1)
        bottomNavigationView.selectedItemId = R.id.nav_chat

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_search -> {
                    startActivity(Intent(applicationContext, SearchLayout::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_add -> {
                    startActivity(Intent(applicationContext, AddMentor::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_home -> {
                    startActivity(Intent(applicationContext, MainMenu::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(applicationContext, ProfileLayout::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_chat -> return@setOnNavigationItemSelectedListener true

            }
            false
        }


    }
}