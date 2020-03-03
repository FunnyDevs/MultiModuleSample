package com.funnydevs.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.funnydevs.base.navigator.Navigator
import javax.inject.Inject

abstract class BaseActivity: AppCompatActivity() {

    @Inject
    protected lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onBackPressed() {
        if (!navigator.handleBack()) {
            super.onBackPressed();
        }
    }


    internal fun getNavigator() = navigator
}