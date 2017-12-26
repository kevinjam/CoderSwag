package com.kevinjanvier.codeswag.Service

import com.kevinjanvier.codeswag.model.Category
import com.kevinjanvier.codeswag.model.Product

/**
 * Created by kevinjanvier on 26/12/2017.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Banie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$40", "hat2"),
            Product("Devslopes Hat White", "$20", "hat3"),
            Product("Devslopes Graphic Banie", "$32", "hat3")
    )

    val hoodies = listOf(
            Product("Developes Hoodie Gray", "$16", "hoodie1"),
            Product("Developes Hoodie Red", "$38", "hoodie2"),
            Product("Developes Black Hoodie", "$48", "hoodie3"),
            Product("Developes Gray Hoddie", "$10", "hoodie4")


    )

    val shirts = listOf(
            Product("Developes Shirt Black", "$18", "shirt1"),
            Product("Developes Shirt Light Gray", "$18", "shirt2"),
            Product("Developes Logo Shirt Red ", "$18", "shirt3"),
            Product("Developes Husle", "$18", "shirt4"),
            Product("Developes Studio", "$18", "shirt4")


    )
}