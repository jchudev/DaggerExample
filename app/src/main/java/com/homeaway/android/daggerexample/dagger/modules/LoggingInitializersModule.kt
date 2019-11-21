package com.homeaway.android.daggerexample.dagger.modules

import com.homeaway.android.daggerexample.application.initializers.ApplicationInitializer
import com.homeaway.android.daggerexample.application.initializers.LoggingInitializer
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class LoggingInitializersModule {
    @get:Provides
    @get:IntoSet
    val firstInitializer: ApplicationInitializer = LoggingInitializer("Called by number one!")

    @get:Provides
    @get:IntoSet
    val secondInitializer: ApplicationInitializer = LoggingInitializer("Called by number two!")
}