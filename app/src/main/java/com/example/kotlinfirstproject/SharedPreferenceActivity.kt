package com.example.kotlinfirstproject

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SharedPreferenceActivity : AppCompatActivity() {

    private lateinit var etName : EditText
    private lateinit var etAge : EditText

    private lateinit var btnNext : Button

    //SharedPreference
    private lateinit var sp : SharedPreferences
    private lateinit var editor : SharedPreferences.Editor
//
//    private lateinit var sp1 : SharedPreferences
//    private lateinit var editor1 : SharedPreferences.Editor



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        etName = findViewById<EditText>(R.id.etName)
        etAge = findViewById<EditText>(R.id.etAge)
        btnNext = findViewById<Button>(R.id.btnNext)

        sp = getSharedPreferences("my_sp", MODE_PRIVATE)
        editor = sp.edit()
//
//        sp1 = getSharedPreferences("my_sp", MODE_PRIVATE)
//        editor1 = sp1.edit()


    }

    override fun onPause() {
        super.onPause()
        val name = etName.text.toString()
        val age = etAge.text.toString().toInt()

//        editor1.apply {
//            putString("123",name)
//            putInt("123",age)
//            commit()
//        }

        editor.apply {
            putString("sp_name",name)
            putInt("sp_age",age)
            commit()
        }
    }

    override fun onResume() {
        super.onResume()
//        val  name1 = sp.getString("123",null)
//        val age1 = sp.getInt("123",0)
//
//        val intent = Intent(this@SharedPreferenceActivity,MainActivity2::class.java)
//        intent.putExtra("123",age1)
//        startActivity(intent)
//
//        val age2 = intent.getStringExtra("123")


        val name = sp.getString("sp_name",null)
        val age = sp.getInt("sp_age",0)
        etName.setText(name)

        if (age!=0)
        {
            etAge.setText(age.toString())
        }

    }
}