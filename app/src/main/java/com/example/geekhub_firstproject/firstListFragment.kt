package com.example.geekhub_firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_first_list.*

class firstListFragment : Fragment(R.layout.fragment_first_list) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_first_list, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var list1 = mutableListOf(
            ListData("So, we got this far, i think it works", true),
            ListData("Then RecyclerView should work fine", true),
            ListData("If it doesn't...", false),
            ListData("Then i truly know nothing", false),
            ListData("Sampletext", false),
        )
        val adapterRecyclerView = List1Adapter(list1)
        rvList1.adapter = adapterRecyclerView
        rvList1.layoutManager = LinearLayoutManager(this.context)
    }
}