package com.toothpicksample.common.navigator

class NavigationModel<V: String, K: Any>(m: MutableMap<out V, out K>?) : LinkedHashMap<V, K>(m)