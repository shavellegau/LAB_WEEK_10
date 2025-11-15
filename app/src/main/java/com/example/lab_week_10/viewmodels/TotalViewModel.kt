package com.example.lab_week_10.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

class TotalViewModel : ViewModel() {

    private val _total = MutableLiveData(0)
    val total: LiveData<Int> get() = _total

    private val _date = MutableLiveData<String>()
    val date: LiveData<String> get() = _date

    fun incrementTotal() {
        _total.postValue((_total.value ?: 0) + 1)
    }

    fun setTotal(newTotal: Int) {
        _total.postValue(newTotal)
    }

    fun updateDate() {
        val format = SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault())
        _date.value = format.format(Date())
    }
}
