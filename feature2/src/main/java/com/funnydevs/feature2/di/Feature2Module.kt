package com.funnydevs.feature1.di

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.funnydevs.feature2.Feature2ViewModel
import com.funnydevs.base.di.BaseViewModelFactory
import com.funnydevs.base.di.ViewModelKey
import com.funnydevs.base.rx.BaseSchedulerManager
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap


@Module
object Feature2Module
{
    @Provides
    @IntoMap
    @ViewModelKey(Feature2ViewModel::class)
    @JvmStatic
    fun viewModel(baseSchedulerManager: BaseSchedulerManager,prova:String?): ViewModel {
        return Feature2ViewModel(baseSchedulerManager,prova)
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