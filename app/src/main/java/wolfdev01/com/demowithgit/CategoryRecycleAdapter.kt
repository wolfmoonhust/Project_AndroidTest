package wolfdev01.com.demowithgit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.MyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false)
        return  MyHolder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder?.bindCategory(context, categories[position])
    }

    inner class MyHolder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView!!) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(context: Context, category: Category) {
            val resoureId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resoureId)
            categoryName?.text = category.title
            itemView.setOnClickListener{itemClick(category)}
        }
    }
}