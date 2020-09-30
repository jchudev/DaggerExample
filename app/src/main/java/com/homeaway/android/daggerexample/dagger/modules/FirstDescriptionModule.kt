package com.homeaway.android.daggerexample.dagger.modules

import com.homeaway.android.daggerexample.descriptions.DescriptionConfig
import com.homeaway.android.daggerexample.descriptions.FirstDescriptionConfig
import dagger.Module
import dagger.Provides

@Module
class FirstDescriptionModule {

    @Provides
    fun providesConfig(): DescriptionConfig {
        return FirstDescriptionConfig()
    }

}