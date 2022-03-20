package com.example.learnappdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        addList()
    }

    fun addList(){
        val arrayList = arrayOf("item1", "item2", "item3")
        val listView = findViewById<ListView>(R.id.list)
        val arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            arrayList
        )
        listView.adapter = arrayAdapter

    }
}