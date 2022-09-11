package com.example.challengechaptertiga

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class AdapterKata (val listKata : ArrayList<ListKata>): RecyclerView.Adapter<AdapterKata.ViewHolder>() {
    lateinit var context : Context
    class ViewHolder (view : View): RecyclerView.ViewHolder(view){
        var btnItem = view.findViewById<Button>(R.id.btnItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_kata,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.btnItem.text = listKata[position].kata
        holder.btnItem.setOnClickListener (object  : View.OnClickListener{
            override fun onClick(v: View?) {
                    val link = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q= ${holder.btnItem.text.toString()}"))
                    context.startActivity(link)
                }
        })



    }

    override fun getItemCount(): Int {
        return listKata.size
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }


}