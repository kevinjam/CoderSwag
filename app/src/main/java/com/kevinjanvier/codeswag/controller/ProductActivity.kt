package com.kevinjanvier.codeswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kevinjanvier.codeswag.R
import com.kevinjanvier.codeswag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    var product = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_product)

        product = intent.getStringExtra(EXTRA_CATEGORY)

        println(product)
    }
}
