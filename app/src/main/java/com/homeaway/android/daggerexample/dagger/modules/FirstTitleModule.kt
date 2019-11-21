package com.homeaway.android.daggerexample.dagger.modules

import com.homeaway.android.daggerexample.titles.FirstTitleConfig
import com.homeaway.android.daggerexample.titles.TitleConfig
import dagger.Module
import dagger.Provides

@Module
class FirstTitleModule {

    @Provides
    fun providesConfig(): TitleConfig {
        return FirstTitleConfig()
    }

}