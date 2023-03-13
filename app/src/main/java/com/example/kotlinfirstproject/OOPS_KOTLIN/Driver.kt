package com.example.kotlinfirstproject.OOPS_KOTLIN

import android.util.Log

class Driver(var name : String,credit : Int) {

    //Field Variables
   // var driverName = ""
    //lateinit var driverName : String

    private var totalCredit = 50


    private val car = Car()

   // var  driverName = name

    init {
        totalCredit += credit
    //    driverName = name
        car.maxSpeed = 150
        car.start()
    }
    fun showDetails()
    {
        Log.i("MYTAG","name of the driver is $name with $totalCredit")
    }

}