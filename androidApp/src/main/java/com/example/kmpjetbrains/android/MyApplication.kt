package com.example.kmpjetbrains.android

import android.app.Application
import com.example.kmpjetbrains.android.di.androidModule
import com.example.kmpjetbrains.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(appModule() + androidModule)
        }
    }
}