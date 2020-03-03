package com.funnydevs.feature2

import com.funnydevs.base.BaseViewModel
import com.funnydevs.base.rx.BaseSchedulerManager
import javax.inject.Inject

class Feature2ViewModel @Inject constructor(baseSchedulerManager: BaseSchedulerManager,val prova: String?): BaseViewModel(baseSchedulerManager) {


    init {
        var n = "";
    }
}