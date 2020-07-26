package wolfdev01.com.demowithgit

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_product.*
import wolfdev01.com.demowithgit.adapter.ProductsAdapter
import wolfdev01.com.demowithgit.services.DataServices
import wolfdev01.com.demowithgit.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataServices.getProducts(categoryType))
        val orientation = resources.configuration.orientation
        var spanCount = 2
        if ( orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount =3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 4
        }
        val  layoutManager =  GridLayoutManager(this,spanCount)


        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }
}