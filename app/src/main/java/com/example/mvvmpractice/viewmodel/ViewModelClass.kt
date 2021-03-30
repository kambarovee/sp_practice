package com.example.mvvmpractice.viewmodel

// import androidx.lifecycle.LiveData
// import androidx.lifecycle.MutableLiveData
import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.mvvmpractice.repository.Repository

class ViewModelClass(val myRepository: Repository) : ViewModel()