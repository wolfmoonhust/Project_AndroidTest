package wolfdev01.com.demowithgit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_view.*
import wolfdev01.com.demowithgit.services.DataServices
import wolfdev01.com.demowithgit.utilities.EXTRA_CATEGORY

class ListViewActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        adapter = CategoryRecycleAdapter(this, DataServices.categories) { category ->
            val productIntent =  Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        categoryList.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryList.layoutManager = layoutManager

        categoryList.setHasFixedSize(true)

    }
}