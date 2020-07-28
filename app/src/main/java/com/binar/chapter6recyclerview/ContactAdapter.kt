package com.binar.chapter6recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_contact_item.view.*

class ContactAdapter(val listContact: ArrayList<MyContact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.my_contact_item,parent,false)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listContact.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tvNama.text = listContact[position].nama
        holder.itemView.tvNoHp.text = listContact[position].noHp
    }
}