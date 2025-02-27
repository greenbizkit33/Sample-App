package com.nathanhaze.aavia

import android.app.Application
import android.content.Context

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {
        lateinit var appContext: Context
    }
}