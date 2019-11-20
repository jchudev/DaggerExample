package com.homeaway.android.daggerexample.dagger

import com.homeaway.android.daggerexample.descriptions.*
import dagger.Module
import dagger.Provides

@Module
class CompoundDescriptionModule {

    @Provides
    fun providesFirst(): FirstDescription {
        return FirstDescription()
    }

    @Provides
    fun providesSecond(): SecondDescription {
        return SecondDescription()
    }

    @Provides
    fun providesThird(): ThirdDescription {
        return ThirdDescription()
    }

    @Provides
    fun providesConfig(first: FirstDescription, second: SecondDescription, third: ThirdDescription): DescriptionConfig {
        return CompoundDescriptionConfig(first, second, third)
    }

}