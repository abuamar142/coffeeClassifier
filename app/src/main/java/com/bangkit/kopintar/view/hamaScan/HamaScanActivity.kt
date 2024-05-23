package com.bangkit.kopintar.view.hamaScan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.kopintar.databinding.ActivityHamaScanBinding

class HamaScanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHamaScanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHamaScanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}