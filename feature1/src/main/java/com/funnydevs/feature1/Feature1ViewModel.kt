package com.funnydevs.feature1

import com.funnydevs.base.BaseViewModel
import com.funnydevs.base.rx.BaseSchedulerManager
import javax.inject.Inject

class Feature1ViewModel @Inject constructor(baseSchedulerManager: BaseSchedulerManager,val prova: String?): BaseViewModel(baseSchedulerManager) {


    init {
        var n = "";
    }
}