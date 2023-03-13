package com.example.kotlinfirstproject.ViewModelDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinfirstproject.R
import com.example.kotlinfirstproject.databinding.ActivityViewModelBinding

class ViewModelActivity : AppCompatActivity() {


    private lateinit var viewModel: MainActivityViewModel

    var count = 0


    private lateinit var binding : ActivityViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)


    //    setContentView(R.layout.activity_view_model)

    //    val tvCount = findViewById<TextView>(R.id.tvCount)
       // val btnCount = findViewById<Button>(R.id.btnCound)

    //    binding.tvCount.text = viewModel.count.toString()
      //  tvCount.text = count.toString()



        viewModel.count.observe(this, Observer {
            binding.tvCount.text = it.toString()
        })

        binding.btnCound.setOnClickListener {


            viewModel.updateCount()
            //ViewModel
        //    binding.tvCount.text = viewModel.count.toString()
//            ++count
//            tvCount.text = count.toString()
        }
    }
}