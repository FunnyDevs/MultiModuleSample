package com.toothpicksample.common.di

import android.app.Application
import android.content.Context
import android.os.Bundle
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
}