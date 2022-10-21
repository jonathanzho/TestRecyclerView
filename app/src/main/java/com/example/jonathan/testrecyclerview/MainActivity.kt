package com.example.jonathan.testrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = SimpleAdapter(generateItemModelList())

        val recyclerView: RecyclerView = findViewById(R.id.simple_recyclerview)

        // LinearLayoutManager is used for displaying the items in a horizontal or
        // vertical scrollable list:
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Add divider between items:
        recyclerView.addItemDecoration(DividerItemDecoration(this,
            DividerItemDecoration.VERTICAL))

        recyclerView.adapter = adapter
    }

    /*
     * For testing purposes, just generate an item model list.
     */
    private fun generateItemModelList(): List<SimpleItemModel> {
        val itemModelList: MutableList<SimpleItemModel> = ArrayList()

        // Manual data entry:
        for (i in 0..99) {
            itemModelList.add(SimpleItemModel("This is item", i))
        }

        return itemModelList
    }
}