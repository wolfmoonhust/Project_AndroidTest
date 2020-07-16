package wolfdev01.com.demowithgit

import android.content.Context
import android.view.ContextMenu
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecycleViewAdapter(val cotext : Context, val categories: List<Category>) : RecyclerView.Adapter<RecycleViewAdapter.MyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}