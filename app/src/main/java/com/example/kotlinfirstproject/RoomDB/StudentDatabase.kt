package com.example.kotlinfirstproject.RoomDB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kotlinfirstproject.RoomDB.DB.Student

@Database(entities = [Student::class], version = 1, exportSchema = false)
abstract class StudentDatabase  :RoomDatabase(){

    abstract fun studentDao():StudentDao
    companion object
    {
        @Volatile
        private var INSTANCE : StudentDatabase?=null
        fun getInstance(conetext : Context):StudentDatabase
        {
            synchronized(this)
            {
                var instance = INSTANCE
                if (instance==null)
                {
                    instance = Room.databaseBuilder(
                        conetext.applicationContext,
                        StudentDatabase::class.java,
                        "student_data_database"
                    ).build()
                }
                return instance
            }

        }

    }

}