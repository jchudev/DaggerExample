package com.homeaway.android.daggerexample.dagger.components

import com.homeaway.android.daggerexample.application.ExampleApplication
import com.homeaway.android.daggerexample.dagger.scopes.ExampleApplicationScope
import dagger.Component

@ExampleApplicationScope
@Component(dependencies = [
    VeryLowLevelComponent::class
])
interface ExampleApplicationComponent {
    fun inject(application: ExampleApplication)
}
