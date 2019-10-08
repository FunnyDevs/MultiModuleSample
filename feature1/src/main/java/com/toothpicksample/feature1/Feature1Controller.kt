package com.toothpicksample.feature1

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IntDef
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.bluelinelabs.conductor.changehandler.SimpleSwapChangeHandler
import com.toothpicksample.common.BaseController
import com.toothpicksample.common.navigator.NavigationModel
import com.toothpicksample.feature1.di.DaggerFeature1Component
import java.lang.annotation.RetentionPolicy



class Feature1Controller(args: Bundle?) : BaseController<Feature1ViewModel>(args) {
    

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.feature1, container, false)
        viewModel = ViewModelProviders.of(activity!! as AppCompatActivity,viewModelFactory).get(Feature1ViewModel::class.java)

        Handler().postDelayed({
            navigator?.goTo(
                route = "/feature2",
                asRoot = false,
                pushHandler= SimpleSwapChangeHandler()
            )
        },3000)


        return view
    }

    override fun injectDependencies() {

        DaggerFeature1Component.factory()
            .create(args,coreComponent())
            .inject(this)

    }

}