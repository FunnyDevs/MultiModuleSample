package com.toothpicksample.common

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.toothpicksample.common.rx.BaseSchedulerManager
import com.toothpicksample.common.rx.SchedulerManager

abstract class BaseViewModel(schedulerManager: BaseSchedulerManager): ViewModel()
{

}