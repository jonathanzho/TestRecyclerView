package com.example.jonathan.testrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var mSimpleTextView: TextView = itemView.findViewById(R.id.simple_text_view)

    fun bindData(itemModel: ItemModel) {
        mSimpleTextView.text = itemModel.simpleText
    }
}