package com.example.mytamagotchi

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Pengugame : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pengugame)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
         lateinit var sharedPreferences: SharedPreferences
         lateinit var healthbar:ProgressBar
         var health=0

        val feedbtn=findViewById<Button>(R.id.feedbtn)
        val cleanbtn=findViewById<Button>(R.id.cleanbtn)
        val playbtn=findViewById<Button>(R.id.playbtn)
        healthbar=findViewById(R.id.healthbar)
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val savedProgress = sharedPreferences.getInt("health", 100)

        feedbtn.setOnClickListener {
            if (health<100){
                health+=10
                healthbar.progress=health
                health = sharedPreferences.getInt("health", 10)
            }
            val Intent=Intent(this,PenguFeeding::class.java)
            startActivity(Intent)
        }
        cleanbtn.setOnClickListener {
            if (health<100) {
                health += 10
                healthbar.progress = health
                health = sharedPreferences.getInt("health", 10)
            }
            val Intent=Intent(this,Penguclean::class.java)
            startActivity(Intent)
        }
        playbtn.setOnClickListener {
            if (health<100) {
                health += 10
                healthbar.progress = health
                health = sharedPreferences.getInt("health", 10)
            }
            val Intent=Intent(this,Penguplay::class.java)
            startActivity(Intent)
        }
        fun incrementHealth(increment: Int) {
            // Increment the progress and save it in SharedPreferences
            health += increment
            if (health > 100) health = 100
            healthbar.progress = health
            with(sharedPreferences.edit()) {
                putInt("health", health)
            }
        }

    }

}
//reference list
//pengugameimage was developed on microsoft paint
//https://in.pinterest.com/pin/1093319247026347387/
