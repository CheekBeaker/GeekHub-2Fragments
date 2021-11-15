package com.example.geekhub_firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_first_list.*
import kotlinx.android.synthetic.main.fragment_first_list.rvList1
import kotlinx.android.synthetic.main.fragment_fourth_list.*
import kotlinx.android.synthetic.main.fragment_second_list.*
import kotlinx.android.synthetic.main.fragment_third_list.*

class fourthListFragment : Fragment(R.layout.fragment_fourth_list) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_fourth_list, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var list4 = mutableListOf(
            ListData("Loooong list!", false),
            ListData("It goes for a while, test scroll", false),
            ListData("q", false),
            ListData("w", false),
            ListData("e", true),
            ListData("r", true),
            ListData("t", true),
            ListData("y", true),
            ListData("u", true),
            ListData("i", true),
            ListData("o", true),
            ListData("p", true),
            ListData("[", true),
            ListData("]", true),
            ListData("a", true),
            ListData("s", true),
            ListData("d", true),
            ListData("f", true),
            )
        val adapterRecyclerView = List4Adapter(list4)
        rvList4.adapter = adapterRecyclerView
        rvList4.layoutManager = LinearLayoutManager(this.context)
    }
}