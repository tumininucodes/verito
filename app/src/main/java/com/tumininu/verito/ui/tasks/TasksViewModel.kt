package com.tumininu.verito.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.tumininu.verito.data.TasksDao

class TasksViewModel @ViewModelInject constructor(
    private val tasksDao: TasksDao
) : ViewModel() {

    val tasks = tasksDao.getTasks().asLiveData()
}