package com.kevinjanvier.codeswag.controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.kevinjanvier.codeswag.R
import com.kevinjanvier.codeswag.Service.DataService
import com.kevinjanvier.codeswag.Utilities.EXTRA_CATEGORY
import com.kevinjanvier.codeswag.adapters.ProductAdapter
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    var product = ""
    lateinit var adapter : ProductAdapter
    var spanCount =2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_product)

        product = intent.getStringExtra(EXTRA_CATEGORY)

        println(product)

         adapter = ProductAdapter(this, DataService.getProducts(product))

        val  orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp

        if (screenSize > 720){
            spanCount = 3
        }


        productRecyclerView.adapter = adapter
        val layoutManager = GridLayoutManager(this, spanCount)
        productRecyclerView.layoutManager = layoutManager



    }
}
