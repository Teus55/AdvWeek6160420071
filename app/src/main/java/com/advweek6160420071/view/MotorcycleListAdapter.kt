package com.advweek6160420071.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.advweek6160420071.databinding.MotorcycleListItemBinding
import com.advweek6160420071.model.Motorcycle

class MotorcycleListAdapter(val motorcycleList: ArrayList<Motorcycle>)
    :RecyclerView.Adapter<MotorcycleListAdapter.MotorcycleViewHolder>(){
    class MotorcycleViewHolder (var binding: MotorcycleListItemBinding)
        :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotorcycleViewHolder {
        val binding = MotorcycleListItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return MotorcycleViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return motorcycleList.size
    }

    override fun onBindViewHolder(holder: MotorcycleViewHolder, position: Int) {
        holder.binding.txtName.text = motorcycleList[position].name
        holder.binding.txtBrand.text = motorcycleList[position].brand
        holder.binding.txtCC.text = motorcycleList[position].engineDisplacementCc
        holder.binding.txtYear.text = motorcycleList[position].year
//        holder.binding.txtColor.text = motorcycleList[position].nam
        holder.binding.txtSpeed.text = motorcycleList[position].specs.topSpeedMph
        holder.binding.txtFuel.text = motorcycleList[position].specs.fuelCapacityGallons
        holder.binding.txtWeight.text = motorcycleList[position].specs.weightLbs
    }

    fun updateMotorcycleList(newMotorcycleList: ArrayList<Motorcycle>) {
        motorcycleList.clear()
        motorcycleList.addAll(newMotorcycleList)
        notifyDataSetChanged()
    }


}