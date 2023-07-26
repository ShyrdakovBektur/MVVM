package com.itproger.mvvm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.itproger.mvvm.databinding.ActivityMainBinding
import com.itproger.mvvm.viewmodel.CounterViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val counterViewModel: CounterViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      counterViewModel.couterModel.observe(this@MainActivity) { value ->
          binding.counterTv.text = value.toString()
      }
        binding.incrementBtn.setOnClickListener {
            counterViewModel.incrementCounter()
        }
        binding.decrementBtn.setOnClickListener {
            counterViewModel.decrementCounter()
        }
    }
}



