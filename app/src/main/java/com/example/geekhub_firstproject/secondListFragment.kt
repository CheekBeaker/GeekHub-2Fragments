package com.example.geekhub_firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_first_list.*
import kotlinx.android.synthetic.main.fragment_first_list.rvList1
import kotlinx.android.synthetic.main.fragment_second_list.*

class secondListFragment : Fragment(R.layout.fragment_second_list) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_second_list, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var list2 = mutableListOf(
            ListData("List #2!", true),
            ListData("Lets list pets or something?", false),
            ListData("Dogs?", false),
            ListData("Cats?", false),
            ListData("Sampletext", false),
        )
        val adapterRecyclerView = List2Adapter(list2)
        rvList2.adapter = adapterRecyclerView
        rvList2.layoutManager = LinearLayoutManager(this.context)
    }
}