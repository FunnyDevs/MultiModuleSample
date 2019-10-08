package com.toothpicksample.sample.di

import android.os.Bundle
import android.view.ViewGroup
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.toothpicksample.common.BaseActivity
import com.toothpicksample.common.navigator.Navigator
import com.toothpicksample.sample.AppNavigator
import dagger.Module
import dagger.Provides

@Module
object ActivityModule {

    @JvmStatic
    @Provides
    fun router(activity: BaseActivity, root: ViewGroup, savedInstanceState: Bundle?): Router
    {
        return Conductor.attachRouter(activity, root, savedInstanceState)
    }

    @JvmStatic
    @Provides
    fun navigator(router: Router): Navigator
    {
        return AppNavigator(router)
    }
}