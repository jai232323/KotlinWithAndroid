package com.example.kotlinfirstproject.Coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinfirstproject.R
import com.example.kotlinfirstproject.databinding.ActivityCoroutinesBinding
import kotlinx.coroutines.*

class CoroutinesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoroutinesBinding

    private var count =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCoroutinesBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnCount?.setOnClickListener {
            binding.tvCount!!.text = count++.toString()
        }
        binding.btnDownload!!.setOnClickListener {



            CoroutineScope(Dispatchers.IO).launch {
                downloadUserData()
            }

            /*

            Coroutine will run in the Main(UI)thread

            CoroutineScope is a Interface

            another interface GlobalInterface

            (Dispatcher.IO) is a Contect

            .launch is a launch

            4 types of Dispatcher
            Dispatcher.IO --> Background process
            Dispatcher.Main --> UI
            Dispatcher.Default --> for Cpu
            Dispatcher.Unconfined --> global scope

            Suspending functions
            withContext , delay , withTimeout , await ,
            withTimeOutOrNull , supervisorScope , join , coroutineScope


             */


        }
    }

    private suspend fun downloadUserData() {
        for (i in 1..200000)
        {
            Log.i("MYTAG","Downloading user $i in ${Thread.currentThread().name}")

            withContext(Dispatchers.Main)
            {
                binding.tvMessage!!.text ="Downloading user $i"
            }


            delay(100)

        }
    }
}