package com.example.kotlinfirstproject.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinfirstproject.R
import com.example.kotlinfirstproject.databinding.ActivityReclyclerViewBinding

class ReclyclerViewActivity : AppCompatActivity() {


    val fruitsList = listOf<String>("Apple","Banana","Guava","Mango","Lemon","Pear"
        ,"Apple","Banana","Guava","Mango","Lemon","Pear"
        ,"Apple","Banana","Guava","Mango","Lemon","Pear"
        ,"Apple","Banana","Guava","Mango","Lemon","Pear"
        ,"Apple","Banana","Guava","Mango","Lemon","Pear"
        ,"Apple","Banana","Guava","Mango","Lemon","Pear"
        ,"Apple","Banana","Guava","Mango","Lemon","Pear"
        ,"Apple","Banana","Guava","Mango","Lemon","Pear"
    )




    private lateinit var binding: ActivityReclyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        binding = ActivityReclyclerViewBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.recyclerView.layoutManager = GridLayoutManager(this,3)

        //binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)

        binding.recyclerView.adapter = MyRecylcerViewAdapter(fruitsList,this)

    }
}