package com.funnydevs.base

import android.app.Application
import android.content.Context
import com.funnydevs.base.di.AppComponent
import com.funnydevs.base.di.DaggerAppComponent

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