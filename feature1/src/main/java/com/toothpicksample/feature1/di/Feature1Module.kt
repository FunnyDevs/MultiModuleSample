package com.toothpicksample.feature1.di

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.toothpicksample.common.di.BaseViewModelFactory
import com.toothpicksample.common.di.ViewModelKey
import com.toothpicksample.common.rx.BaseSchedulerManager
import com.toothpicksample.feature1.Feature1ViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap


@Module
object Feature1Module
{
    @Provides
    @IntoMap
    @ViewModelKey(Feature1ViewModel::class)
    @JvmStatic
    fun viewModel(baseSchedulerManager: BaseSchedulerManager,prova:String?): ViewModel {
        return Feature1ViewModel(baseSchedulerManager,prova)
    }

    @Provides
    @JvmStatic
    fun viewModelFactory(map: Map<Class<out ViewModel>,@JvmSuppressWildcards ViewModel>): BaseViewModelFactory
    {
        return BaseViewModelFactory(map)
    }

    @Provides
    @JvmStatic
    fun prova(bundle: Bundle?): String?
    {
        return bundle?.getString("prova")
    }


}