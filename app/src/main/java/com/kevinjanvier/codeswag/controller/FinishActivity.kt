package com.kevinjanvier.codeswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kevinjanvier.codeswag.R
import com.kevinjanvier.codeswag.Utilities.EXTRA_FINISH
import com.kevinjanvier.codeswag.model.Product
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var finish:Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        finish = intent.getParcelableExtra(EXTRA_FINISH)

        println( "Finish -- ${finish.title}  ${finish.price}" )

        val resourceId = this.resources.getIdentifier(finish.image, "drawable", this.packageName)
        println("Drawable " +resourceId)
        productImage.setImageResource(resourceId)

        productTitle.text = finish.title
        productPrice.text = finish.price

    }
}
