package com.toothpicksample.common

import android.content.Context
import android.os.Bundle
import android.view.View
import com.bluelinelabs.conductor.Controller
import com.toothpicksample.common.di.BaseViewModelFactory
import javax.inject.Inject

abstract class BaseController<G: BaseViewModel>(args: Bundle?) : Controller(args)
{
    private val DATA = "data"
    protected val navigator by lazy { baseActivity?.getNavigator() }

    protected var baseActivity: BaseActivity? = null
        get() {
            return if (activity != null)
                activity as BaseActivity
            else
                null
        }


    protected lateinit var viewModel: G
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

//    @InjectConstructor
//    private class BaseViewFactory<N: BaseNavigationModel, M: BaseViewModel<*>>(var viewModel: M)
//        :ViewModelProvider.Factory
//    {
//        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//            return viewModel as T;
//        }
//
//    }

    fun BaseController<out BaseViewModel>.coreComponent() = BaseApplication.coreComponent(activity!!)
}