package com.bangkit.kopintar.view.hamaResult

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.kopintar.R
import com.bangkit.kopintar.databinding.ActivityHamaResultBinding

class HamaResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHamaResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHamaResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}