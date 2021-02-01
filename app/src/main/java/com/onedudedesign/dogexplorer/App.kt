package com.onedudedesign.dogexplorer

import android.app.Application
import com.onedudedesign.dogexplorer.di.appModule
import com.onedudedesign.dogexplorer.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(listOf(appModule, viewModelModule))
        }
    }

}