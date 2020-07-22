package wolfdev01.com.demowithgit.services

import wolfdev01.com.demowithgit.Category
import wolfdev01.com.demowithgit.Product

class DataServices {
    val categories = listOf<Category>(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "degitalgoodsimage")
    )

    val hats = listOf<Product>(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Graphic Black", "$20", "hat02"),
            Product("Devslopes Graphic White", "$18", "hat03"),
            Product("Devslopes Graphic Snapback", "$12", "hat04"))

    val hoodies = listOf<Product>(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Hoodie Gray", "$28", "hoodie03"),
            Product("Devslopes Black Hoodie", "$32", "hoodie04")
    )
    val shirts = listOf<Product>(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Badge Light Gray", "$20", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$28", "shirt03"),
            Product("Devslopes Hustle", "$32", "shirt04"),
            Product("Kickflip Studio", "$12", "shirt05")
    )
}