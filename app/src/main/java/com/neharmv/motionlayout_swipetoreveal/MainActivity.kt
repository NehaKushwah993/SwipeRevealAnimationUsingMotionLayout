package com.neharmv.swipetoreveal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewAdapter = CustomAdapter()
        recycler_view.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.adapter = viewAdapter
    }
}