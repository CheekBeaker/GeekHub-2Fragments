package com.example.geekhub_firstproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class List2Adapter(
    var list2: List<ListData>
) : RecyclerView.Adapter<List2Adapter.List2Holder>() {

    inner class List2Holder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): List2Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return List2Holder(view)
    }

    override fun onBindViewHolder(holder: List2Holder, position: Int) {
        holder.itemView.apply {
            tvTitle.text = list2[position].title
            cbDone.isChecked = list2[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}