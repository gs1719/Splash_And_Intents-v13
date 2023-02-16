package com.example.v13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.v13.databinding.ActivityOrderBinding

class Order : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)

        binding.textViewOrder.text=orderOfCustomer

    }

}