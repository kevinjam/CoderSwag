package com.kevinjanvier.codeswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.kevinjanvier.codeswag.R
import com.kevinjanvier.codeswag.Service.DataService
import com.kevinjanvier.codeswag.adapters.CategoryAdapter
import com.kevinjanvier.codeswag.model.Category
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter:CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryAdapter(this,DataService.categories)

        listview.adapter = adapter
    }
}
