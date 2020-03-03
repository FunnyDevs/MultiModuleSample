package com.funnydevs.base

import android.content.Context
import android.os.Bundle
import android.view.View
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.autodispose.ControllerScopeProvider
import com.funnydevs.base.di.BaseViewModelFactory
import javax.inject.Inject

abstract class BaseController<G: BaseViewModel>(args: Bundle?) : Controller(args)
{
    //Navigator instance
    protected val navigator by lazy { baseActivity?.getNavigator() }
    //Scopeprovider autodispose
    protected val scopeProvider = ControllerScopeProvider.from(this)
    protected lateinit var viewModel: G
    protected var baseActivity: BaseActivity? = null
        get() {
            return if (activity != null)
                activity as BaseActivity
            else
                null
        }


    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory


    override fun onContextAvailable(context: Context) {
        super.onContextAvailable(context)
        injectDependencies()
    }

    abstract fun injectDependencies()

    override fun onDestroyView(view: View) {
        super.onDestroyView(view)
    }


}