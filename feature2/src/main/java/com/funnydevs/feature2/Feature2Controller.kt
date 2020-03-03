package com.funnydevs.feature2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.funnydevs.base.BaseController
import com.funnydevs.feature1.di.DaggerFeature2Component
import com.funnydevs.hoop.common.di.AppInjectHelper

class Feature2Controller(args: Bundle?) : BaseController<Feature2ViewModel>(args) {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.feature2, container, false)
        viewModel = ViewModelProviders.of(activity!! as AppCompatActivity,viewModelFactory).get(Feature2ViewModel::class.java)

        return view
    }

    override fun injectDependencies() {

        DaggerFeature2Component.factory()
            .create(args,AppInjectHelper.provideCoreComponent(applicationContext!!))
            .inject(this)

    }

}