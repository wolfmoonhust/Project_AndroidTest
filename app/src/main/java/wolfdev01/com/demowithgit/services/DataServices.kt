package wolfdev01.com.demowithgit.services

import wolfdev01.com.demowithgit.Category
import wolfdev01.com.demowithgit.Product

object DataServices {
    val categories = listOf<Category>(
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

    val hats = listOf<Product>(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Graphic Black", "$20", "hat2"),
            Product("Devslopes Graphic White", "$18", "hat3"),
            Product("Devslopes Graphic Snapback", "$12", "hat4"))

    val hoodies = listOf<Product>(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$32", "hoodie2"),
            Product("Devslopes Hoodie Gray", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$32", "hoodie4")
    )
    val shirts = listOf<Product>(
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$28", "shirt3"),
            Product("Devslopes Hustle", "$32", "shirt4"),
            Product("Kickflip Studio", "$12", "shirt5")
    )

    val digitalGood = listOf<Product>()
    fun getProducts(category: String): List<Product> {
        when (category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood
        }
    }
}