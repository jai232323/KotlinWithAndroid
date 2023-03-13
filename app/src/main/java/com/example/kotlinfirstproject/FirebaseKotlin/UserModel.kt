package com.example.kotlinfirstproject.FirebaseKotlin

public class UserModel {

    private lateinit var id : String
    private lateinit var name : String
    private lateinit var age : String

    constructor(id: String, name: String, age: String) {
        this.id = id
        this.name = name
        this.age = age
    }

}