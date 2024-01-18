package com.example.lingkarapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lingkarapps.databinding.ActivityTskSelfAnalysisBinding

class TskSelfAnalysisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTskSelfAnalysisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTskSelfAnalysisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            val intent = Intent(this@TskSelfAnalysisActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}