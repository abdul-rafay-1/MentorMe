package com.AbdulRafay.i212582


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView


class AddMentor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_mentor)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_app_bar)


        val imgbtn: ImageButton = findViewById(R.id.imageButton7)
        imgbtn.setOnClickListener{
            onBackPressed()
            bottomNavigationView.selectedItemId = R.id.nav_home
        }

        val btn1:Button = findViewById(R.id.button1)
        btn1.setOnClickListener{
            startActivity(Intent(this,VideoLayout::class.java))
        }

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener {
            Toast.makeText(it.context, "Mentor Added...", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainMenu::class.java))

        }

        val btn2:Button = findViewById(R.id.button2)
        btn2.setOnClickListener{
            startActivity(Intent(this,PhotoLayout::class.java))
        }

        bottomNavigationView.selectedItemId = R.id.nav_add
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(applicationContext, MainMenu::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_search -> {
                    startActivity(Intent(applicationContext, SearchLayout::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_chat -> {
                    startActivity(Intent(applicationContext, ChatsLayout::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(applicationContext, ProfileLayout::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_add -> return@setOnNavigationItemSelectedListener true

            }
            false
        }

    }
}