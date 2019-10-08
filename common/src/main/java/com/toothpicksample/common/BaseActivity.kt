package com.toothpicksample.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.toothpicksample.common.navigator.Navigator
import javax.inject.Inject

abstract class BaseActivity: AppCompatActivity() {

    @Inject
    protected lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    fun BaseActivity.coreComponent() = BaseApplication.coreComponent(this)

    internal fun getNavigator() = navigator
}