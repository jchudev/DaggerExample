package com.homeaway.android.daggerexample

import com.homeaway.android.daggerexample.dagger.components.ScreenComponent
import dagger.Component

@Component(modules = [
    TestScreenModule::class
])
interface TestScreenComponent:
    ScreenComponent {

    override fun inject(arg: MainActivity)

}