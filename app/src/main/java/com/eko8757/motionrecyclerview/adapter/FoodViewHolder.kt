package com.eko8757.motionrecyclerview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.eko8757.motionrecyclerview.data.FoodModel
import com.eko8757.motionrecyclerview.databinding.FoodItemLayoutBinding

class FoodViewHolder(private val binding: FoodItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(food: FoodModel) {
        binding.apply {
            tvTitle.text = food.title
            tvDescription.text = food.description
            tvCalories.text = food.calories
            tvRate.text = food.rate
            ivFood.setImageResource(food.imgId)
        }
    }
}