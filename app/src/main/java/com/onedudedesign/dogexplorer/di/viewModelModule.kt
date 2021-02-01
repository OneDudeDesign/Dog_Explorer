package com.onedudedesign.dogexplorer.di

import com.onedudedesign.dogexplorer.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}