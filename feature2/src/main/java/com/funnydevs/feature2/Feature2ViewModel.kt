package com.funnydevs.feature2

import com.toothpicksample.common.BaseViewModel
import com.toothpicksample.common.rx.BaseSchedulerManager
import javax.inject.Inject

class Feature2ViewModel @Inject constructor(baseSchedulerManager: BaseSchedulerManager,val prova: String?): BaseViewModel(baseSchedulerManager) {


    init {
        var n = "";
    }
}