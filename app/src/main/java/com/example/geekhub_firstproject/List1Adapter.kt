package com.example.geekhub_firstproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class List1Adapter(
    var list1: List<ListData>
) : RecyclerView.Adapter<List1Adapter.List1Holder>() {

    inner class List1Holder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): List1Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return List1Holder(view)
    }

    override fun onBindViewHolder(holder: List1Holder, position: Int) {
        holder.itemView.apply {
            tvTitle.text = list1[position].title
            cbDone.isChecked = list1[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return list1.size
    }
}