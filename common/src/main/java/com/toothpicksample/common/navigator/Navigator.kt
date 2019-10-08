package com.toothpicksample.common.navigator

import android.os.Bundle
import android.os.IBinder
import android.os.Parcelable
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import com.toothpicksample.common.BaseController
import com.toothpicksample.common.BaseViewModel
import java.io.Serializable

abstract class Navigator(val router: Router) {

    private val routeMap = mutableMapOf<String,Class<out BaseController<out BaseViewModel>>>()

    protected fun addRoutes(function: (MutableMap<String, Class<out BaseController<out BaseViewModel>>>) -> Unit)
    {
        function.invoke(routeMap)
    }


    fun goTo(route: String, navigationModel: NavigationModel<String, Any>? = null, pushHandler: ControllerChangeHandler,
             popHandler: ControllerChangeHandler? = null, asRoot: Boolean)
    {
        val destination = routeMap[route].let {
            it?.getConstructor(Bundle::class.java)?.newInstance(
                toBundle(navigationModel)
            ) as Controller
        }
        if (destination!= null)
        {
            val routerTransaction = RouterTransaction.with(destination)
                .apply {
                    if (pushHandler != null)
                        this.pushChangeHandler(pushHandler)
                    if (popHandler != null)
                        this.popChangeHandler(popHandler)
                }

            if (asRoot)
                router.setRoot(routerTransaction)
            else
                router.pushController(routerTransaction)
        }

    }


    fun goBack()
    {
        router.popCurrentController()
    }

    private fun toBundle(navigationModel: NavigationModel<String, *>? = null): Bundle?
    {
        return if (navigationModel == null)
            null
        else
            Bundle().apply {
                navigationModel.forEach {
                    val k = it.key
                    val v = it.value
                    when (v) {
                        is IBinder -> putBinder(k, v)
                        is Bundle -> putBundle(k, v)
                        is Byte -> putByte(k, v)
                        is ByteArray -> putByteArray(k, v)
                        is Char -> putChar(k, v)
                        is CharArray -> putCharArray(k, v)
                        is CharSequence -> putCharSequence(k, v)
                        is Float -> putFloat(k, v)
                        is FloatArray -> putFloatArray(k, v)
                        is Parcelable -> putParcelable(k, v)
                        is Serializable -> putSerializable(k, v)
                        is Short -> putShort(k, v)
                        is ShortArray -> putShortArray(k, v)


//      is Size -> putSize(k, v) //api 21
//      is SizeF -> putSizeF(k, v) //api 21

                        else -> throw IllegalArgumentException("$v is of a type that is not currently supported")
//      is Array<*> -> TODO()
//      is List<*> -> TODO()
                    }
                }
            }
    }
}