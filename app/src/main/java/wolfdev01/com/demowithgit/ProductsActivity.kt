package wolfdev01.com.demowithgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import wolfdev01.com.demowithgit.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}