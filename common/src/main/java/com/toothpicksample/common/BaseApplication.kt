package com.toothpicksample.common

import android.app.Application
import android.content.Context
import com.toothpicksample.common.di.AppComponent
import com.toothpicksample.common.di.DaggerAppComponent

abstract class BaseApplication: Application()
{
    private val coreComponent: AppComponent by lazy {
        DaggerAppComponent
            .factory()
            .create(this)
    }

    companion object {
        @JvmStatic fun coreComponent(context: Context) =
            (context.applicationContext as BaseApplication).coreComponent
    }
}