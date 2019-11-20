package com.homeaway.android.daggerexample.descriptions

interface DescriptionConfig {
    fun description(): String
}

class FirstDescriptionConfig: DescriptionConfig {
    override fun description(): String {
        return "FIRST DESCRIPTION"
    }
}

class CompoundDescriptionConfig(private val first: FirstDescription,
                                private val second: SecondDescription,
                                private val third: ThirdDescription): DescriptionConfig {
    
    override fun description(): String {
        return "${first.description}\n${second.description}\n${third.description}"
    }
    
}

data class FirstDescription(val description: String = "Insert Random Thing Here")

data class SecondDescription(val description: String = "Insert Other Description")

data class ThirdDescription(val description: String = "Insert Third Description")