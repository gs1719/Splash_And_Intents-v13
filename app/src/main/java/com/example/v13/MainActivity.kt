package com.example.v13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.v13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // view binding
    private lateinit var binding: ActivityMainBinding
    //    creating key
    companion object{
        const val KEY = "com.example.v13.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val orderPlaced =
                    "1.     "+ binding.editTextTextPersonName3.text.toString()+"\n\n"+
                    "2.     "+binding.editTextTextPersonName4.text.toString()+"\n\n"+
                    "3.     "+binding.editTextTextPersonName5.text.toString()+"\n\n"+
                    "4.     "+binding.editTextTextPersonName6.text.toString()

            intent = Intent(this,Order::class.java).apply {
                putExtra(KEY,orderPlaced)
            }
            startActivity(intent)
        }
    }


}