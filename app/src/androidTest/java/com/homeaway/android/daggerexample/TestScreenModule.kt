package com.homeaway.android.daggerexample

import com.homeaway.android.daggerexample.screen.ScreenConfig
import com.homeaway.android.daggerexample.titles.FirstTitleConfig
import com.homeaway.android.daggerexample.titles.TitleConfig
import dagger.Module
import dagger.Provides
import org.mockito.Mockito

@Module
class TestScreenModule {

    @Provides
    fun providesConfig(): ScreenConfig{
        return Mockito.mock(ScreenConfig::class.java)
    }

}