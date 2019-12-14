package me.ask2asad.android_livedata_binding.mutable

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MutableViewModel: ViewModel() {

    val left = MutableLiveData<String>()
    val right = MutableLiveData<String>()
    val result = MutableLiveData<String>()
    val visibleResult = MutableLiveData<Boolean>().apply { value = false }

    fun plus() {
        val leftNum = left.value.toString().toIntOrNull() ?: run { visibleResult.value = false; return }
        val rightNum = right.value.toString().toIntOrNull() ?: run { visibleResult.value = false; return }
        result.value = (leftNum + rightNum).toString()
        visibleResult.value = true
    }

    fun clear() {
        left.value = ""
        right.value = ""
        result.value = ""
        visibleResult.value = false
    }

}