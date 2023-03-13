package com.example.kotlinfirstproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("MYTAG","SecondActivity : OnCreate")


        val userName = intent.getStringExtra("USER_NAME")
        val tv1 = findViewById<TextView>(R.id.tv1)

        tv1.text = userName
    }
    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","SecondActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","SecondActivity : OnPause")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","SecondActivity : OnRestart")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","SecondActivity : OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","SecondActivity : OnDestory")

    }
}