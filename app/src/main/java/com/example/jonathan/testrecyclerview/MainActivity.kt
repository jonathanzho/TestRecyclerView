package com.example.jonathan.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter: SimpleAdapter = SimpleAdapter(generateSimpleList())
        var recyclerView: RecyclerView = findViewById(R.id.simple_recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.adapter = adapter
    }

    private fun generateSimpleList(): List<ItemModel> {
        var itemModelList: MutableList<ItemModel> = ArrayList<ItemModel>();

        for (i in 0..99) {
            itemModelList.add(ItemModel(String.format(Locale.US, "This is item, %d", i)))
        }

        return itemModelList
    }
}