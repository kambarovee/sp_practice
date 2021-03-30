package com.example.mvvmpractice.di

import com.example.mvvmpractice.repository.Repository
import com.example.mvvmpractice.viewmodel.ViewModelClass
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
//      ViewModelClass(myRepository = Repository())
        ViewModelClass(get())
    }
    single { Repository() }
}
