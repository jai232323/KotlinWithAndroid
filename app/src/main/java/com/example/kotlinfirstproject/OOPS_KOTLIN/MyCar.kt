package com.example.kotlinfirstproject.OOPS_KOTLIN

import android.util.Log


//Inheritance using keyword :
class MyCar : Car(),SpeedController{

    override fun start() {
        Log.i("MYTAG","this is MyCar Starting....Brand is ${getBrandId()}")

    }

    override fun accelerate() {

    }

    override fun decelerate() {

    }

}