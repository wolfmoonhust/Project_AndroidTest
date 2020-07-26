package wolfdev01.com.demowithgit.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_product_detail.*
import wolfdev01.com.demowithgit.Product
import wolfdev01.com.demowithgit.R
import wolfdev01.com.demowithgit.utilities.EXTRA_PRODUCT

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val productItem = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        Log.d("phongtx" ," ${productItem.image} ${productItem.price}  ${productItem.title}")
        val resourceId = resources.getIdentifier(productItem.image, "drawable", packageName)
        productImageDetail.setImageResource(resourceId)
        productTitleDetailTv.text = productItem.title
        productPriceDetailTv.text = productItem.price
        ProductDescriptionTv.text =  "This is test Description  for ${productItem.title} with price ${productItem.price}"
    }
}