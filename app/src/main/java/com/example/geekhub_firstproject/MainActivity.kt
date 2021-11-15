package com.example.geekhub_firstproject

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_button_bar.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val homeFragment = HomeFragment()
        val firstListFragment = firstListFragment()
        val secondListFragment = secondListFragment()
        val thirdListFragment = secondListFragment()
        val fourthListFragment = fourthListFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, homeFragment)
            commit()
        }

       // setSupportActionBar(toolbar)
        //val toggle =
          //  ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        //toggle.isDrawerIndicatorEnabled = true
        //drawerLayout.addDrawerListener(toggle)
        //toggle.syncState()

        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, firstListFragment)
                addToBackStack(null)
                commit()
            }
        }
        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, secondListFragment)
                addToBackStack(null)
                commit()
            }
        }
        button3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, thirdListFragment)
                addToBackStack(null)
                commit()
            }
        }
        button4.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, fourthListFragment)
                addToBackStack(null)
                commit()
            }
        }
        button5.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, homeFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}