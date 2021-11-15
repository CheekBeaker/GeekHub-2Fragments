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
import kotlinx.android.synthetic.main.fragment_third_list.*

class thirdListFragment : Fragment(R.layout.fragment_third_list) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_third_list, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var list3 = mutableListOf(
            ListData("Third list..", false),
            ListData("I thought of passing icons through", false),
            ListData("but it kept NullExcepting", false),
            ListData("So instead i got three text lists", false),
            ListData("in portrait only", true),
        )
        val adapterRecyclerView = List3Adapter(list3)
        rvList3.adapter = adapterRecyclerView
        rvList3.layoutManager = LinearLayoutManager(this.context)
    }
}