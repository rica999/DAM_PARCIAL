package com.example.myexamuntels

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.talles.view.*

class AdapterTalleres(val context: Context, val items: List<String>): androidx.recyclerview.widget.RecyclerView.Adapter<AdapterTalleres.ViewHolder>() {

    fun ViewGroup.inflate(layoutRes: Int): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, false)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.talles))

    override fun getItemCount(): Int = items.size ?:0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items.get(position))
    }

    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

        fun bind(item: String?) {

            itemView.apply {
                lbl_name_taller.text = item
            }

        }
    }
}
