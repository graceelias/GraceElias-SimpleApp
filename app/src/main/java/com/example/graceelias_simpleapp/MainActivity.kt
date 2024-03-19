package com.example.graceelias_simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.graceelias_simpleapp.databinding.ActivityMainBinding
import android.content.SharedPreferences

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    private var buttonClicked = false
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            buttonClicked = true
            updateImage()
        }
    }

    private fun updateImage()
    {
        val num = (Math.random()*5).toInt()
        if(num == 0)
        {
            binding.imageView.setImageResource(R.drawable.boston_university_logo_0)
        }
        else if(num == 1)
        {
            binding.imageView.setImageResource(R.drawable.boston_university_logo_1)
        }
        else if(num == 2)
        {
            binding.imageView.setImageResource(R.drawable.boston_university_logo_2)
        }
        else if(num == 3)
        {
            binding.imageView.setImageResource(R.drawable.boston_university_logo_3)
        }
        else if(num == 5)
        {
            binding.imageView.setImageResource(R.drawable.boston_university_logo_4)
        }
    }
}