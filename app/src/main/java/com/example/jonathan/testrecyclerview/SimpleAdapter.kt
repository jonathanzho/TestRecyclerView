package com.example.jonathan.testrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var models: List<ItemModel> = ArrayList()

    constructor(itemModels: List<ItemModel>) : this() {
        models = itemModels
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return SimpleViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val holder2 = holder as SimpleViewHolder
        holder2.bindData(models[position])
    }

    override fun getItemCount(): Int {
        return models.size
    }

    /* (??? This fun has to be manually added.)
     * Returns the layout resource ID to be used in Adapter.onCreateViewHolder().
     */
    override fun getItemViewType(position: Int): Int {
        return R.layout.item_recyclerview_main
    }
}
