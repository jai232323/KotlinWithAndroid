package com.example.kotlinfirstproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {


    //Activity Lifecycle



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //Logcat

        Log.i("MYTAG","MainActivity2")


        val tv = findViewById<TextView>(R.id.tvHello)
        val et = findViewById<EditText>(R.id.editText)
        val btn = findViewById<Button>(R.id.btnSubmit)
        val btnOffers = findViewById<Button>(R.id.btnOffers)

        var showText = ""

        btn.setOnClickListener {

            showText = et.text.toString()

            if (showText == "")
            {
                btnOffers.visibility = INVISIBLE
                tv.text = ""
                Toast.makeText(this@MainActivity2,"Please,Enter your name!",Toast.LENGTH_SHORT).show()
            }else{
                val message = "Welcome $showText"
                Log.i("MYTAG",message)

                tv.text = message
                et.text.clear()
                Log.i("MYTAG","After displaying the message on the TextView")


                btnOffers.visibility = VISIBLE
                Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            }
        }
        btnOffers.setOnClickListener {

            val intent = Intent(this@MainActivity2,SecondActivity::class.java)
            intent.putExtra("USER_NAME",showText)
            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG","MainActivity2 : OnStart")


    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","MainActivity2 : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","MainActivity2 : OnPause")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","MainActivity : OnRestart")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","MainActivity2 : OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","MainActivity2 : OnDestory")

    }
}