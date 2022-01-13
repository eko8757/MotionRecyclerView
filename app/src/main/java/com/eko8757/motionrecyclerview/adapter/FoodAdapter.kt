package com.eko8757.motionrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eko8757.motionrecyclerview.data.FoodModel
import com.eko8757.motionrecyclerview.databinding.FoodItemLayoutBinding

class FoodAdapter : RecyclerView.Adapter<FoodViewHolder>() {

    private var foodList: MutableList<FoodModel> = mutableListOf()

    fun addAll(genreList: List<FoodModel>) {
        this.foodList.clear()
        this.foodList.addAll(genreList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder =
        FoodViewHolder(FoodItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int = foodList.size

    private fun getItem(position: Int): FoodModel {
        return foodList[position]
    }
}