package com.funnydevs.hoop.common.di

import com.funnydevs.base.BaseActivity
import com.funnydevs.base.BaseController

interface AppComponentProvider {

    fun provideCoreComponent(): AppComponent
}