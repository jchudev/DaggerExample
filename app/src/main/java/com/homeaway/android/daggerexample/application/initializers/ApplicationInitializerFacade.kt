package com.homeaway.android.daggerexample.application.initializers

import android.app.Application
import javax.inject.Inject

class ApplicationInitializerFacade @Inject constructor(
    private val initializers: Set<@JvmSuppressWildcards ApplicationInitializer>
) : ApplicationInitializer {

    override fun init(app: Application) {
        initializers.map {
            it.init(app)
        }
    }

}