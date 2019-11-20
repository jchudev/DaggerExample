package com.homeaway.android.daggerexample.dagger

import com.homeaway.android.daggerexample.descriptions.DescriptionConfig
import com.homeaway.android.daggerexample.screen.ScreenConfig
import com.homeaway.android.daggerexample.titles.FirstTitleConfig
import com.homeaway.android.daggerexample.titles.TitleConfig
import dagger.Module
import dagger.Provides

@Module
class ScreenModule {

    @Provides
    fun providesScreenConfig(titleConfig: TitleConfig, descriptionConfig: DescriptionConfig): ScreenConfig {
        return ScreenConfig(titleConfig, descriptionConfig)
    }

}