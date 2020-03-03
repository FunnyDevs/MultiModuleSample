package com.funnydevs.base

import androidx.lifecycle.ViewModel
import com.funnydevs.base.rx.BaseSchedulerManager

abstract class BaseViewModel(schedulerManager: BaseSchedulerManager): ViewModel()
{

}