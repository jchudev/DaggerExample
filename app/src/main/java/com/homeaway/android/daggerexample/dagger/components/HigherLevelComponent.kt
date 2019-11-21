package com.homeaway.android.daggerexample.dagger.components

import com.homeaway.android.daggerexample.dagger.modules.ContextModule
import com.homeaway.android.daggerexample.dagger.scopes.HigherLevelScope
import com.homeaway.android.daggerexample.dependencies.ContextUsingDependency
import dagger.Component

@HigherLevelScope
@Component(modules = [
    ContextModule::class
], dependencies = [
    VeryLowLevelComponent::class
])
interface HigherLevelComponent {
    val dependency: ContextUsingDependency
}