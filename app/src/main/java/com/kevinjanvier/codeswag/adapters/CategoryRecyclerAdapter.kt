package com.kevinjanvier.codeswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kevinjanvier.codeswag.R
import com.kevinjanvier.codeswag.model.Category

/**
 * Created by kevinjanvier on 26/12/2017.
 */
class CategoryRecyclerAdapter(val context:Context, val categories:List<Category>, val itemClick : (Category) ->Unit) :RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {


    override fun onBindViewHolder(holder: Holder?, position: Int) {

        holder!!.bindCategory(categories[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {

        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.category_list_item, parent, false)

        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {return categories.size
    }

    inner class Holder(itemView: View?, itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

        val categoryImage:ImageView = itemView!!.findViewById(R.id.categoryImage)
        val categoryName:TextView = itemView!!.findViewById(R.id.categoryTitle)

        fun bindCategory(category:Category, context:Context){
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title

            itemView.setOnClickListener { itemClick(category) }

        }

    }
}