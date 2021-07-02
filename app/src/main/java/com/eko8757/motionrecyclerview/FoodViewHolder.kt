package com.eko8757.motionrecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.eko8757.motionrecyclerview.databinding.FoodItemLayoutBinding

class FoodViewHolder(private val binding: FoodItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(food: FoodModel) {
        binding.tvTitle.text = food.title
        binding.tvDescription.text = food.description
        binding.tvCalories.text = food.calories
        binding.tvRate.text = food.rate
        binding.ivFood.setImageResource(food.imgId)
    }

}