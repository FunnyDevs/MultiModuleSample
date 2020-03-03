package com.funnydevs.base.rx

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

abstract interface  BaseSchedulerManager {

    fun io() : Scheduler
    fun ui() : Scheduler

}

class SchedulerManager: BaseSchedulerManager {

    override fun io() = Schedulers.io()
    override fun ui() = AndroidSchedulers.mainThread()

}

class TestSchedulerManager: BaseSchedulerManager {

    override fun io() = Schedulers.trampoline()
    override fun ui() = Schedulers.trampoline()

}