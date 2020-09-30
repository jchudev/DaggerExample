package com.homeaway.android.daggerexample.application.initializers

import android.app.Application

/**
 * Configuration interface for performing ad-hoc initialization on app startup.
 */
interface ApplicationInitializer {
    fun init(app: Application)
}