package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dice.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.rollButton.setOnClickListener { roll() }
        setContentView(binding.root)
    }

    private fun roll() {
        val random1 = Random().nextInt(6) + 1
        val res1 = when(random1){
            1 -> R.drawable.dice_1;
            2 -> R.drawable.dice_2;
            3 -> R.drawable.dice_3;
            4 -> R.drawable.dice_4;
            5 -> R.drawable.dice_5;
            6 -> R.drawable.dice_6;
            else -> R.drawable.empty_dice;
        }
        binding.imageView.setImageResource(res1)

        val random2 = Random().nextInt(6) + 1
        val res2 = when(random2){
            1 -> R.drawable.dice_1;
            2 -> R.drawable.dice_2;
            3 -> R.drawable.dice_3;
            4 -> R.drawable.dice_4;
            5 -> R.drawable.dice_5;
            6 -> R.drawable.dice_6;
            else -> R.drawable.empty_dice;
        }
        binding.imageView2.setImageResource(res2)
    }

}