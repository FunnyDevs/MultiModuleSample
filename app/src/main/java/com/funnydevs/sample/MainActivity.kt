package com.funnydevs.sample

import android.os.Bundle
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.changehandler.SimpleSwapChangeHandler
import com.funnydevs.base.BaseActivity
import com.funnydevs.base.navigator.NavigationModel
import com.funnydevs.hoop.common.di.AppInjectHelper
import com.funnydevs.sample.di.DaggerActivityComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var router: Router


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerActivityComponent
            .factory()
            .create(this,root,savedInstanceState, AppInjectHelper.provideCoreComponent(applicationContext))
            .inject(this)

        navigator.goTo(
            route = "/feature1",
            pushHandler= SimpleSwapChangeHandler(),
            navigationModel = NavigationModel(
                mutableMapOf("prova" to "prova di test")
            ),
            asRoot = true
        )



    }

}
