package com.homeaway.android.daggerexample.titles

interface TitleConfig {
    fun name(): String
}

class FirstTitleConfig: TitleConfig {

    override fun name(): String {
        return "First Config!"
    }

}

class SecondTitleConfig: TitleConfig {

    override fun name(): String {
        return "SECOND config :)"
    }

}