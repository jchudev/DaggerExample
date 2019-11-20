package com.homeaway.android.daggerexample.screen

import com.homeaway.android.daggerexample.descriptions.DescriptionConfig
import com.homeaway.android.daggerexample.titles.TitleConfig

open class ScreenConfig(private val titleConfig: TitleConfig, private val descriptionConfig: DescriptionConfig) {
    
    fun name(): String {
        return titleConfig.name()
    }
    
    fun description(): String {
        return descriptionConfig.description()
    }
    
}