package com.example.jonathan.testrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*
 * The ViewHolder class holds the RecyclerView item's view.
 */
class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var itemNameTextView: TextView? = null
    private var itemAgeTextView: TextView? = null

    init {
        itemNameTextView = itemView.findViewById(R.id.item_name_text_view)
        itemAgeTextView = itemView.findViewById(R.id.item_age_text_view)
    }

    /*
     * This will be called by Adapter.onBindViewHolder().
     */
    fun bindData(itemModel: SimpleItemModel) {
        itemNameTextView!!.text = itemModel.itemName
        itemAgeTextView!!.text = itemModel.itemAge.toString()
    }
}