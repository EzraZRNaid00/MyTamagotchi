package com.example.mytamagotchi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val choosepengu = findViewById<Button>(R.id.choosepengu)
        choosepengu.setOnClickListener {
            val intent = Intent(this, Pengugame::class.java)
            startActivity(intent)
        }
    }
}
//Reference list
//Penguhome was developed om microsoft paint
//https://in.pinterest.com/pin/998251073635230200/
//https://in.pinterest.com/pin/827395762818773735/