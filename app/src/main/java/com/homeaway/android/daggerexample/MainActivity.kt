package com.homeaway.android.daggerexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.homeaway.android.daggerexample.dagger.DaggerScreenComponent
import com.homeaway.android.daggerexample.screen.ScreenConfig
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var config: ScreenConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerScreenComponent.builder()
            .build()
            .inject(this)

        findViewById<TextView>(R.id.name).text = config.name()
        findViewById<TextView>(R.id.description).text = config.description()
    }
}
