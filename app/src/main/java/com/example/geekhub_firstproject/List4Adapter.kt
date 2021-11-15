package com.example.geekhub_firstproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class List4Adapter(
    var list4: List<ListData>
) : RecyclerView.Adapter<List4Adapter.List4Holder>() {

    inner class List4Holder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): List4Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return List4Holder(view)
    }

    override fun onBindViewHolder(holder: List4Holder, position: Int) {
        holder.itemView.apply {
            tvTitle.text = list4[position].title
            cbDone.isChecked = list4[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return list4.size
    }
}