package com.itproger.mvvm.model

class CounterModel {
     private var count: Int = 0

    fun getCurrentCount(): Int {
        return count
    }
    fun decrement() {
        count--
    }
    fun increment() {
        count++
    }
}
