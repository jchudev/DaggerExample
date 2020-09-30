package com.homeaway.android.daggerexample.dagger.components

import com.homeaway.android.daggerexample.MainActivity
import com.homeaway.android.daggerexample.dagger.modules.FirstDescriptionModule
import com.homeaway.android.daggerexample.dagger.modules.FirstTitleModule
import com.homeaway.android.daggerexample.dagger.modules.ScreenModule
import dagger.Component

@Component(modules = [
    ScreenModule::class,
    FirstTitleModule::class,
    FirstDescriptionModule::class
])
interface ScreenComponent {
    fun inject(arg: MainActivity)
}