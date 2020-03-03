package com.funnydevs.base.extensions

fun <T> T?.notNull(function: (T) -> Unit)
{
    if (this != null)
        return function(this)
}
