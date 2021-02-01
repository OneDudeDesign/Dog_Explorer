package com.onedudedesign.dogexplorer.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onedudedesign.dogexplorer.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(Timber.DebugTree())

        val mainViewModel: MainViewModel by viewModel()
    }
}