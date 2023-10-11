package com.example.staffui.ui.fragments.staff.stafflist

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.staffui.R
import com.example.staffui.databinding.FilterLayoutBinding
import com.example.staffui.domain.models.FilterModel

class FilterAdapter(private var list: MutableList<FilterModel>, val context: Context) :
    RecyclerView.Adapter<FilterAdapter.ViewHolder>() {
    private var selectedItemPos = 0
    private var isSelected = false
    inner class ViewHolder(private val itemBinding: FilterLayoutBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: FilterModel) {
            itemBinding.categoryName.text = item.category

            itemBinding.also {
                if (isSelected) {
                    it.cardV.setCardBackgroundColor(context.resources.getColor(R.color.blue))
                    it.categoryName.setTextColor(context.resources.getColor(R.color.white))
                }else{
                    it.cardV.setCardBackgroundColor(context.resources.getColor(R.color.gray))
                    it.categoryName.setTextColor(context.resources.getColor(R.color.black))
                }
                it.categoryName.setOnClickListener {
                    val previouslySelectedItemPosition = selectedItemPos
                    selectedItemPos = position

                    notifyItemChanged(previouslySelectedItemPosition)
                    notifyItemChanged(position)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            FilterLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val item = list[position]
         isSelected = position == selectedItemPos
        holder.bind(item)
    }
}
