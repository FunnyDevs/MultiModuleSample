package com.funnydevs.base.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.funnydevs.base.annotations.AppScope
import com.funnydevs.base.rx.BaseSchedulerManager
import com.funnydevs.base.rx.SchedulerManager
import dagger.Module
import dagger.Provides

@Module
object BaseModule {

    @Provides
    fun context(application: Application): Context
    {
        return application.applicationContext
    }

    @Provides
    fun schedulerManager(): BaseSchedulerManager {
        return SchedulerManager()
    }

    @Provides
    @AppScope
    fun sharedPreferences(context: Context): SharedPreferences{
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}