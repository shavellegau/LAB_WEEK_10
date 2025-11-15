package com.example.lab_week_10.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalViewModel : ViewModel() {

    private val _total = MutableLiveData(0)
    val total: LiveData<Int> get() = _total

    // Increase the total
    fun incrementTotal() {
        _total.postValue((_total.value ?: 0) + 1)
    }

    // Set new total value (required in instructions)
    fun setTotal(newTotal: Int) {
        _total.postValue(newTotal)
    }
}
