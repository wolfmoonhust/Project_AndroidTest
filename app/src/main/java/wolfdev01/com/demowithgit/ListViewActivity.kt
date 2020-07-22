package wolfdev01.com.demowithgit

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_view.*
import wolfdev01.com.demowithgit.adapter.CategoryAdapter
import wolfdev01.com.demowithgit.services.DataServices

class ListViewActivity : AppCompatActivity() {
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        adapter = CategoryAdapter(this, DataServices.categories)
        categoryList.adapter = adapter
    }
}