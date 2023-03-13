package com.example.kotlinfirstproject.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinfirstproject.R
import org.w3c.dom.Text

class MyRecylcerViewAdapter(val fruitsList : List<String>,val context: Context)
    : RecyclerView.Adapter<MyRecylcerViewAdapter.ViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val fruit = fruitsList[position]
        holder.textView.text = fruit
        holder.itemView.setOnClickListener {
            Toast.makeText(context,fruitsList[position ],Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val textView = itemView.findViewById<TextView>(R.id.tvName)
    }
}