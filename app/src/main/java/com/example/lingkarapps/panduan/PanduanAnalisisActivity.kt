package com.example.lingkarapps.panduan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lingkarapps.TskSelfAnalysisActivity
import com.example.lingkarapps.databinding.ActivityPanduanAnalisisBinding


class PanduanAnalisisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPanduanAnalisisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPanduanAnalisisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.panduanBtn.setOnClickListener {
            val intent = Intent(this@PanduanAnalisisActivity, TskSelfAnalysisActivity::class.java)
            startActivity(intent)
        }
    }
}