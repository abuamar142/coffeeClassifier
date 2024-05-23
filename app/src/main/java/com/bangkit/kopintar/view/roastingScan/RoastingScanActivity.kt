package com.bangkit.kopintar.view.roastingScan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.kopintar.databinding.ActivityRoastingScanBinding

class RoastingScanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRoastingScanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRoastingScanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}