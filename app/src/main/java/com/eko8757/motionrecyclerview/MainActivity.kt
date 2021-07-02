package com.eko8757.motionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.eko8757.motionrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var foodAdapter: FoodAdapter = FoodAdapter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        with(binding) {
            rvMain.layoutManager = LinearLayoutManager(this@MainActivity)
            rvMain.adapter = foodAdapter
            foodAdapter.addAll(foodDummyData)
        }
    }
}