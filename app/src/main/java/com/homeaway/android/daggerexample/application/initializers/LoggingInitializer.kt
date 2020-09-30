package com.homeaway.android.daggerexample.application.initializers

import android.app.Application
import android.util.Log

class LoggingInitializer(private val message: String) : ApplicationInitializer {
    override fun init(app: Application) {
        Log.i(TAG, message)
    }

    companion object {
        private const val TAG = "DemoLogz"
    }
}