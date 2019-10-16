package com.toothpicksample.feature1

import com.toothpicksample.common.BaseViewModel
import com.toothpicksample.common.rx.BaseSchedulerManager
import javax.inject.Inject

class Feature1ViewModel @Inject constructor(baseSchedulerManager: BaseSchedulerManager,val prova: String?): BaseViewModel(baseSchedulerManager) {


    init {
        var n = "";
    }
}