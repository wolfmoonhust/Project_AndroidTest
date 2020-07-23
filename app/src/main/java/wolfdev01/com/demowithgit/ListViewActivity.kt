package wolfdev01.com.demowithgit

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_view.*
import wolfdev01.com.demowithgit.adapter.CategoryAdapter
import wolfdev01.com.demowithgit.services.DataServices

class ListViewActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        adapter = CategoryRecycleAdapter(this, DataServices.categories)
        categoryList.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryList.layoutManager = layoutManager

        categoryList.setHasFixedSize(true)

    }
}