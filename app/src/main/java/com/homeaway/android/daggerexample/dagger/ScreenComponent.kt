package com.homeaway.android.daggerexample.dagger

import com.homeaway.android.daggerexample.MainActivity
import dagger.Component

@Component(modules = [
    ScreenModule::class,
    FirstTitleModule::class,
    FirstDescriptionModule::class
])
interface ScreenComponent {

    fun inject(arg: MainActivity)

}