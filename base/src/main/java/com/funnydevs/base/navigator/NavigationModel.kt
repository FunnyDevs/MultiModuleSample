package com.funnydevs.base.navigator

class NavigationModel<V: String, K: Any>(m: MutableMap<out V, out K>?) : LinkedHashMap<V, K>(m)