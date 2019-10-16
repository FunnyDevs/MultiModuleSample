package com.toothpicksample.sample.di

import android.os.Bundle
import android.view.ViewGroup
import com.toothpicksample.common.di.AppComponent
import com.toothpicksample.common.BaseActivity
import com.toothpicksample.sample.MainActivity
import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [AppComponent::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance activity: BaseActivity,@BindsInstance root: ViewGroup,
                   @BindsInstance savedInstanceState: Bundle?, appComponent: AppComponent
        ): ActivityComponent
    }

}