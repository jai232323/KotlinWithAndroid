package com.example.kotlinfirstproject.RoomDB

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinfirstproject.RoomDB.DB.Student
import kotlinx.coroutines.launch

class StudentViewModel(private val dao : StudentDao)
    : ViewModel() {


    val students = dao.getAllStudents()

    fun insertStudent(student: Student)=viewModelScope.launch {
        dao.insertStudent(student)
    }
    fun updateStudent(student: Student)=viewModelScope.launch {
        dao.updateStudent(student)
    }
    fun deleteStudent(student: Student)=viewModelScope.launch {
        dao.deleteStudent(student)
    }


}