package com.example.kotlinfirstproject.FirebaseKotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinfirstproject.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.core.Context

class UserAdapter (val userList : MutableList<User1>,val context : android.content.Context): RecyclerView.Adapter<UserAdapter.ViewHolder> (){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val view = LayoutInflater.from(context).inflate(R.layout.users,parent,false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val userModel = userList.get(position)

        holder.userName.setText(userModel.name)
        holder.userAge.setText(userModel.age)

        holder.itemView.setOnClickListener {

            var reference : DatabaseReference

            reference = FirebaseDatabase.getInstance().getReference("Users")

            reference.child(userModel.id).removeValue().addOnSuccessListener {
                Toast.makeText(context,"${userModel.name} Deleted Successfully",Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
             Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show()
            }

        }


    }

    override fun getItemCount(): Int {
        return userList.size
    }
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        val userName : TextView = itemView.findViewById(R.id.userName)
        val userAge : TextView = itemView.findViewById(R.id.userAge)

    }
}