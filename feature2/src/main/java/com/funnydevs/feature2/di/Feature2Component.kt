package com.toothpicksample.feature1.di

import android.os.Bundle
import com.funnydevs.feature2.Feature2Controller
import com.funnydevs.feature2.di.Feature2Scope
import com.toothpicksample.common.di.AppComponent
import dagger.BindsInstance
import dagger.Component

@Feature2Scope
@Component(modules = [Feature2Module::class], dependencies = [AppComponent::class])
interface Feature2Component {

    fun inject(feature1Controller: Feature2Controller)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance bundle: Bundle, appComponent: AppComponent): Feature2Component
    }
}