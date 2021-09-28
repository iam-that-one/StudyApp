package com.example.studyapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.telephony.ims.RcsUceAdapter
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.item_row.view.*

class RecycleViewAddapter(val topics : List<String>,val description: List<String>) : RecyclerView.Adapter<RecycleViewAddapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val topic = topics[position]
        val info = description[position]
        holder.itemView.apply {
            idTVCourseName.text = topic
            description.text = info
        }
    }

    override fun getItemCount() = topics.size


}
class RecycleViewAddapter2(val topics : List<String>,val description: List<String>) : RecyclerView.Adapter<RecycleViewAddapter2.ItemViewHolder>() {
    class ItemViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val topic = topics[position]
        val info = description[position]
        holder.itemView.apply {
            idTVCourseName.text = topic
            description.text = info
        }
    }

    override fun getItemCount() = topics.size


}