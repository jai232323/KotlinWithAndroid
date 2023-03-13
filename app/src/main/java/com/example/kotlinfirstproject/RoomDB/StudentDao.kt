package com.example.kotlinfirstproject.RoomDB

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.kotlinfirstproject.RoomDB.DB.Student


@Dao
interface StudentDao {

    //DAO - Direct Access Object

    @Insert
    suspend fun insertStudent(student: Student)

    @Update
    suspend fun updateStudent(student: Student)

    @Delete
    suspend fun deleteStudent(student: Student)

    @Query("SELECT * FROM student_data_table")
    fun getAllStudents():LiveData<List<Student>>


}