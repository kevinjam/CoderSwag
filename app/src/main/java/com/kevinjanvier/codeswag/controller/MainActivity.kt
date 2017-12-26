package com.kevinjanvier.codeswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.kevinjanvier.codeswag.R
import com.kevinjanvier.codeswag.Service.DataService
import com.kevinjanvier.codeswag.adapters.CategoryRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter:CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryRecyclerAdapter(this,DataService.categories)
        recycler_view.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.setHasFixedSize(true)
    }
}
