package com.example.kotlinfirstproject.FirebaseKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinfirstproject.R
import com.example.kotlinfirstproject.databinding.ActivityGetDataBinding
import com.google.firebase.database.DatabaseReference

class GetDataActivity : AppCompatActivity() {

    private lateinit var reference: DatabaseReference
    private lateinit var recyclerView: RecyclerView
    private lateinit var userList: ArrayList<User1>

    private lateinit var binding : ActivityGetDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGetDataBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}