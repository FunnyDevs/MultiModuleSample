package com.funnydevs.sample

import android.app.Application
import com.funnydevs.hoop.common.di.AppComponent
import com.funnydevs.hoop.common.di.AppComponentProvider

class CustomApplication : Application(), AppComponentProvider
{
    private lateinit var coreComponent: AppComponent

    override fun provideCoreComponent(): AppComponent = coreComponent


}