package com.eko8757.motionrecyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.eko8757.motionrecyclerview.adapter.FoodAdapter
import com.eko8757.motionrecyclerview.data.FoodModel
import com.eko8757.motionrecyclerview.databinding.ActivityMainBinding
import com.eko8757.motionrecyclerview.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private var foodAdapter: FoodAdapter = FoodAdapter()
    private lateinit var binding: ActivityMainBinding
    private var viewModel: MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        viewModel.getFoodList()
        with(binding) {
            rvMain.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = foodAdapter
            }
        }
        setData()
    }

    private fun setData() {
        viewModel.listData.observe(this) { data ->
            val list = mutableListOf<FoodModel>()
            list.addAll(data)
            foodAdapter.addAll(list)
        }
    }
}