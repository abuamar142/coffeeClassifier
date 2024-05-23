package com.bangkit.kopintar.view.roastingResult

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.kopintar.R
import com.bangkit.kopintar.databinding.ActivityRoastingResultBinding

class RoastingResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRoastingResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRoastingResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}