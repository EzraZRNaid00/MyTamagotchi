package com.example.mytamagotchi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PenguFeeding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pengu_feeding)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var returnbtn2=findViewById<Button>(R.id.returnbtn2)
        returnbtn2.setOnClickListener {
            val Intent= Intent(this,Pengugame::class.java)
            startActivity(Intent)
        }
    }
}
//reference list
//pengueating was developed on microsoft paint
//https://in.pinterest.com/pin/763500943110704641/