package com.example.staffui.ui.fragments.staff.stafflist

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.staffui.databinding.StaffItemLayoutBinding
import com.example.staffui.domain.models.StaffListModel

class StaffAdapter(private var list: MutableList<StaffListModel>) :
    RecyclerView.Adapter<StaffAdapter.ViewHolder>() {

    inner class ViewHolder(private val itemBinding: StaffItemLayoutBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: StaffListModel) {
            itemBinding.name.text = item.staffName
            itemBinding.email.text = item.email
            itemBinding.workingSinceTv.text = "Working since " + item.workingSince.toString() + " days"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            StaffItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }
}