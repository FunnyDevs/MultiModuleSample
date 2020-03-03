package com.funnydevs.feature1.di

import android.os.Bundle
import com.funnydevs.base.di.AppComponent
import com.funnydevs.feature1.Feature1Controller
import dagger.BindsInstance
import dagger.Component

@Feature1Scope
@Component(modules = [Feature1Module::class], dependencies = [AppComponent::class])
interface Feature1Component {

    fun inject(feature1Controller: Feature1Controller)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance bundle: Bundle, appComponent: AppComponent): Feature1Component
    }
}