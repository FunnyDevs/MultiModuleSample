package com.toothpicksample.common.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {

    fun inject(application: Application)

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