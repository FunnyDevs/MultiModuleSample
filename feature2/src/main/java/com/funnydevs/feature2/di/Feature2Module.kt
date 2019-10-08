package com.toothpicksample.feature1.di

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.funnydevs.feature2.Feature2ViewModel
import com.toothpicksample.common.BaseViewModelFactory
import com.toothpicksample.common.di.ViewModelKey
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
    fun viewModel(prova:String?): ViewModel {
        return Feature2ViewModel(prova)
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