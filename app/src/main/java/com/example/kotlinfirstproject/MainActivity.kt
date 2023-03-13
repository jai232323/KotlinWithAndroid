package com.example.kotlinfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.example.kotlinfirstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

     lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        binding.textView1.setOnClickListener(this);
        binding.textView2.setOnClickListener(this);
        binding.textView3.setOnClickListener(this);

    }

    override fun onClick(v: View?) {

        when(v)
        {
            binding.textView1 ->
                Toast.makeText(this,"Small TextView",Toast.LENGTH_SHORT).show()
            binding.textView2 ->
                Toast.makeText(this,"This is Bold TextView",Toast.LENGTH_SHORT).show()
            binding.textView3 ->
                Toast.makeText(this,"This is Italic TextView",Toast.LENGTH_SHORT).show()
            else ->
                Toast.makeText(this,"Default",Toast.LENGTH_SHORT).show()
        }
    }
}