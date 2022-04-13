package com.plandel.swipableviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plandel.swipableviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.avatar1,
            R.drawable.avatar2,
            R.drawable.avatar3,
            R.drawable.yugioh,
        )

        val adapter = ViewPagerAdapter(images)
        binding.viewPager.adapter = adapter

    }
}