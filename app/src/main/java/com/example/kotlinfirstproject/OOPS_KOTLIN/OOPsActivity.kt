package com.example.kotlinfirstproject.OOPS_KOTLIN

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinfirstproject.R

class OOPsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oops)

        //Create objects
     //   val car = Car()
        //How to invoke functions
       // car.maxSpeed = 150
        //car.start()


//        val driver = Driver("Jai",37)
//        driver.showDetails()

        val myCar = MyCar()
        myCar.maxSpeed = 890
        myCar.start()

    }
}