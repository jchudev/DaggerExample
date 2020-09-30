package com.homeaway.android.daggerexample.dagger.modules

import com.homeaway.android.daggerexample.application.initializers.ApplicationInitializer
import com.homeaway.android.daggerexample.application.initializers.ApplicationInitializerFacade
import dagger.Module
import dagger.Provides
import dagger.multibindings.Multibinds

@Module(includes = [
    LoggingInitializersModule::class
])
abstract class ApplicationInitializersModule {

    @Multibinds
    abstract fun initializers(): Set<ApplicationInitializer>

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun initializer(facade: ApplicationInitializerFacade): ApplicationInitializer = facade
    }
}