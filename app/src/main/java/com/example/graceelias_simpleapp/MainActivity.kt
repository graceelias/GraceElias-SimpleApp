package com.example.graceelias_simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.graceelias_simpleapp.databinding.ActivityMainBinding
import android.content.SharedPreferences
import android.content.Context

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences

    private var imageNum = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getPreferences(Context.MODE_PRIVATE)
        imageNum = sharedPreferences.getInt("imageNum", imageNum)
        updateImage(imageNum)
        binding.editText.setText(sharedPreferences.getString("text", ""))

        binding.button.setOnClickListener{
            imageNum = (Math.random()*5).toInt()
            updateImage(imageNum)
        }
    }

    override fun onDestroy()
    {
        super.onDestroy()
        val editor = sharedPreferences.edit()
        editor.putInt("imageNum", imageNum)
        editor.putString("text", binding.editText.text.toString())
        editor.apply()
    }

    private fun updateImage(num: Number)
    {
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