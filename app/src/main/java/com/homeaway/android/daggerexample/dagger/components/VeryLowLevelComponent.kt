package com.homeaway.android.daggerexample.dagger.components

import android.app.Application
import com.homeaway.android.daggerexample.application.initializers.ApplicationInitializer
import com.homeaway.android.daggerexample.dagger.modules.ApplicationInitializersModule
import com.homeaway.android.daggerexample.dagger.modules.LoggingInitializersModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationInitializersModule::class
])
interface VeryLowLevelComponent {

    val initializer: ApplicationInitializer

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder

        fun build(): VeryLowLevelComponent
    }
}

lateinit var component: VeryLowLevelComponent

fun Application.veryLowLevelComponent(): VeryLowLevelComponent {
    if (!::component.isInitialized) {
        component = DaggerVeryLowLevelComponent
            .builder()
            .application(this)
            .build()
    }
    return component
}