package com.funnydevs.hoop.common.di

import android.content.Context

object AppInjectHelper {
    fun provideCoreComponent(applicationContext: Context): AppComponent{
        return if (applicationContext is AppComponentProvider) {
            (applicationContext as AppComponentProvider).provideCoreComponent()
        } else {
            throw IllegalStateException("The application context you have passed does not implement AppComponentProvider")
        }
    }
}