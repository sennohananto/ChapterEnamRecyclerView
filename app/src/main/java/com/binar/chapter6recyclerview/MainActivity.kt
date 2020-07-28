package com.binar.chapter6recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listContact = arrayListOf(
            MyContact("Riska","081212121212"),
            MyContact("Wahyu","081000000000"),
            MyContact("Widarsono","08273737839"),
            MyContact("Widodo","08999999999"),
            MyContact("Riska","081212121212"),
            MyContact("Wahyu","081000000000"),
            MyContact("Widarsono","08273737839"),
            MyContact("Widodo","08999999999"),
            MyContact("Riska","081212121212"),
            MyContact("Wahyu","081000000000"),
            MyContact("Widarsono","08273737839"),
            MyContact("Widodo","08999999999"),
            MyContact("Riska","081212121212"),
            MyContact("Wahyu","081000000000"),
            MyContact("Widarsono","08273737839"),
            MyContact("Widodo","08999999999"),
            MyContact("Riska","081212121212"),
            MyContact("Wahyu","081000000000"),
            MyContact("Widarsono","08273737839"),
            MyContact("Widodo","08999999999"),
            MyContact("Riska","081212121212"),
            MyContact("Wahyu","081000000000"),
            MyContact("Widarsono","08273737839"),
            MyContact("Widodo","08999999999")
        )

        val adapter = ContactAdapter(listContact)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        recyclerView.layoutManager = GridLayoutManager(this,3)
        recyclerView.adapter = adapter
    }
}