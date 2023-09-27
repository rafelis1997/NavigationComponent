package com.rafelis1997.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rafelis1997.navigationcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}