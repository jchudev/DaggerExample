package com.homeaway.android.daggerexample.dagger.modules

import android.app.Application
import android.content.Context
import com.homeaway.android.daggerexample.titles.FirstTitleConfig
import com.homeaway.android.daggerexample.titles.TitleConfig
import dagger.Module
import dagger.Provides

@Module
class ContextModule {
    @Provides
    fun context(application: Application): Context = application
}