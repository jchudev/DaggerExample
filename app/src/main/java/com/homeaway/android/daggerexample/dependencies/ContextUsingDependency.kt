package com.homeaway.android.daggerexample.dependencies

import android.content.Context
import com.homeaway.android.daggerexample.R
import com.homeaway.android.daggerexample.dagger.scopes.HigherLevelScope
import javax.inject.Inject

@HigherLevelScope
class ContextUsingDependency @Inject constructor(context: Context) {
    val data = context.getString(R.string.context_using_dependency_data)
}