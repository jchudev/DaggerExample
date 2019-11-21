package com.homeaway.android.daggerexample.application

import android.app.Application
import com.homeaway.android.daggerexample.application.initializers.ApplicationInitializer
import com.homeaway.android.daggerexample.dagger.components.DaggerExampleApplicationComponent
import com.homeaway.android.daggerexample.dagger.components.veryLowLevelComponent
import javax.inject.Inject

class ExampleApplication : Application() {

    private val component by lazy {
        DaggerExampleApplicationComponent.builder()
            .veryLowLevelComponent(veryLowLevelComponent())
            .build()
    }

    @Inject
    lateinit var initializer: ApplicationInitializer

    override fun onCreate() {
        super.onCreate()

        component.inject(this)

        initializer.init(this)
    }
}