package com.itproger.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.itproger.mvvm.model.CounterModel

class CounterViewModel : ViewModel() {
    private val model = CounterModel()
   private val counter = MutableLiveData<Int>()
    val couterModel: LiveData<Int> get() = counter
    init {
        counter.value = model.getCurrentCount()
    }
    fun decrementCounter() {
        model.decrement()
        counter.value = model.getCurrentCount()
    }
    fun incrementCounter() {
        model.increment()
        counter.value = model.getCurrentCount()
    }


}