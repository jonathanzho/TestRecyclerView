package com.example.jonathan.testrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*
 * The ViewHolder class holds the RecyclerView item's view.
 */
class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var simpleTextView: TextView? = null

    init {
        simpleTextView = itemView.findViewById(R.id.item_name_text_view)
    }

    /*
     * This will be called by Adapter.onBindViewHolder().
     */
    fun bindData(itemModel: SimpleItemModel) {
        simpleTextView!!.text = itemModel.simpleText
    }
}