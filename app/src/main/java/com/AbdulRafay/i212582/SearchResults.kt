package com.AbdulRafay.i212582

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.content.Intent
import android.widget.ImageButton
import androidx.annotation.NonNull
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.AbdulRafay.i212582.AdapterClass
import com.AbdulRafay.i212582.ItemClass


class SearchResults : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_results)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_app_bar)

        val imgbtn: ImageButton = findViewById(R.id.imageButton7)
        imgbtn.setOnClickListener{
            onBackPressed()
            bottomNavigationView.selectedItemId = R.id.nav_home
        }

        bottomNavigationView.selectedItemId = R.id.nav_search
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(applicationContext, MainMenu::class.java))
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_add -> {
                    startActivity(Intent(applicationContext, AddMentor::class.java))
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
                R.id.nav_search -> return@setOnNavigationItemSelectedListener true

            }
            false
        }



        //val rv: RecyclerView = findViewById(R.id.recyclerView)



        // Find the RecyclerView from the MainActivity
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Create and set the layout manager for the RecyclerView
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val itemClasses = mutableListOf<ItemClass>()

        // Add item instances to the list

        itemClasses.add(ItemClass( R.drawable.search_result_image,R.drawable.heart, "Sample 1", "Lead - Technology Officer","Available", "\$500/Session"))
        itemClasses.add(ItemClass( R.drawable.search_result_image,R.drawable.heart, "Sample 2", "Lead - Technology Officer","Available", "\$500/Session"))
        itemClasses.add(ItemClass( R.drawable.search_result_image,R.drawable.heart, "Sample 3", "Lead - Technology Officer","Available", "\$500/Session"))
        itemClasses.add(ItemClass( R.drawable.search_result_image,R.drawable.heart, "Sample 4", "Lead - Technology Officer","Available", "\$500/Session"))

        // Create and set the adapter
        val adapter = AdapterClass(itemClasses)
        recyclerView.adapter = adapter

    }
}

