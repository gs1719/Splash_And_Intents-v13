package com.example.v13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.v13.databinding.ActivityOrderBinding

class Order : AppCompatActivity() {
    private lateinit var binding: ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)

        binding.textViewOrder.text=orderOfCustomer

    }
}