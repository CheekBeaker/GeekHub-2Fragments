package com.example.geekhub_firstproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class List3Adapter(
    var list3: List<ListData>
) : RecyclerView.Adapter<List3Adapter.List3Holder>() {

    inner class List3Holder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): List3Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return List3Holder(view)
    }

    override fun onBindViewHolder(holder: List3Holder, position: Int) {
        holder.itemView.apply {
            tvTitle.text = list3[position].title
            cbDone.isChecked = list3[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return list3.size
    }
}