package com.toothpicksample.common.di

import android.app.Application
import com.toothpicksample.common.rx.BaseSchedulerManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(application: Application)
    fun baseSchedulerManager(): BaseSchedulerManager

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): AppComponent
    }

//    @Component.Builder
//    interface Builder
//    {
//        fun build(): AppComponent
//
//        @BindsInstance
//        fun application(application: Application): Builder
//    }
}