package com.toothpicksample.common.di

import android.app.Application
import android.content.Context
import android.os.Bundle
import com.toothpicksample.common.rx.BaseSchedulerManager
import com.toothpicksample.common.rx.SchedulerManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule
{
    @JvmStatic
    @Provides
    @Singleton
    fun context(application: Application): Context
    {
        return application.applicationContext
    }

    @Provides
    @JvmStatic
    @Singleton
    fun schedulerManager(): BaseSchedulerManager{
        return SchedulerManager()
    }
}