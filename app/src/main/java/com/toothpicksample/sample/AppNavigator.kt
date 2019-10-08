package com.toothpicksample.sample

import com.bluelinelabs.conductor.Router
import com.funnydevs.feature2.Feature2Controller
import com.toothpicksample.common.navigator.Navigator
import com.toothpicksample.feature1.Feature1Controller

class AppNavigator(router: Router): Navigator(router) {


    init {
        addRoutes {
            it["/feature1"] = Feature1Controller::class.java
            it["/feature2"] = Feature2Controller::class.java
        }
    }

}