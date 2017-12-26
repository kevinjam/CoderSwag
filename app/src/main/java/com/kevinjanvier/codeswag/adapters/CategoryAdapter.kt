package com.kevinjanvier.codeswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.kevinjanvier.codeswag.R
import com.kevinjanvier.codeswag.model.Category

/**
 * Created by kevinjanvier on 26/12/2017.
 */
class CategoryAdapter(context:Context, categories:List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoriesView :View
        val holder:ViewHolder

        if (convertView == null){
            categoriesView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

            holder = ViewHolder()

            holder.categoryImage = categoriesView.findViewById(R.id.categoryImage)
           holder.categoryTitle = categoriesView.findViewById(R.id.categoryTitle)

            categoriesView.tag = holder

        }else{
            holder = convertView.tag as ViewHolder
            categoriesView = convertView
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage!!.setImageResource(resourceId)
        holder.categoryTitle!!.text = category.title

        return categoriesView
    }

    override fun getItem(position: Int): Any {

        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var categoryImage :ImageView? = null
        var categoryTitle :TextView? = null
    }
}