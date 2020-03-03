package com.funnydevs.sample

import com.bluelinelabs.conductor.Router
import com.funnydevs.feature2.Feature2Controller
import com.funnydevs.base.navigator.Navigator
import com.funnydevs.feature1.Feature1Controller

class AppNavigator(router: Router): Navigator(router) {


    init {
        addRoutes {
            it["/feature1"] = Feature1Controller::class.java
            it["/feature2"] = Feature2Controller::class.java
        }
    }

}