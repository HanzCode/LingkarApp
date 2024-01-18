package com.example.lingkarapps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lingkarapps.databinding.ActivityMainBinding
import com.example.lingkarapps.panduan.PanduanAnalisisActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomButton.setOnClickListener {
            val intent = Intent(this@MainActivity, PanduanAnalisisActivity::class.java)
            startActivity(intent)
        }

    }


}