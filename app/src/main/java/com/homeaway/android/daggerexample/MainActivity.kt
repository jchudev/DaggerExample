package com.homeaway.android.daggerexample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.homeaway.android.daggerexample.dagger.components.DaggerScreenComponent
import com.homeaway.android.daggerexample.screen.ScreenConfig
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var config: ScreenConfig

    private val component by lazy {
        DaggerScreenComponent.builder()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        component.inject(this)

        setViewForState()
    }

    private fun setViewForState() {
        name.text = config.name()
        description.text = config.description()
    }
}
