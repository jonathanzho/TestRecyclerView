package com.example.jonathan.testrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = SimpleAdapter(generateSimpleList())
        val recyclerView: RecyclerView = findViewById(R.id.simple_recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun generateSimpleList(): List<SimpleItemModel> {
        val itemModelList: MutableList<SimpleItemModel> = ArrayList();

        for (i in 0..99) {
            itemModelList.add(SimpleItemModel(String.format(Locale.US, "This is item, %d", i)))
        }

        return itemModelList
    }
}