package com.toothpicksample.common.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class BaseViewModelFactory
@Inject constructor(private val viewmodelMap: Map<Class<out ViewModel>,ViewModel>): ViewModelProvider.Factory
{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewmodelMap[modelClass] as T;
    }

}