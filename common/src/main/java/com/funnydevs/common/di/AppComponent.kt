package com.funnydevs.hoop.common.di

import android.app.Application
import com.bluelinelabs.conductor.Controller
import com.funnydevs.base.annotations.AppScope
import com.funnydevs.base.di.BaseModule
import com.funnydevs.base.rx.BaseSchedulerManager
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [BaseModule::class/*, NetworkModule::class*/])
interface AppComponent {

    fun inject(application: Application)
    fun inject(controller: Controller)

    fun baseSchedulerManager(): BaseSchedulerManager
//    fun retrofit(): Retrofit

//    fun sharedPreferences(): SharedPreferences

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(app: Application): Builder
//        @BindsInstance fun serverUrl(serverUrl: String): Builder
        fun build(): AppComponent
    }
}