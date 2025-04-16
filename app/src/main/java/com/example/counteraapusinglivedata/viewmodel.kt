package com.example.counteraapusinglivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewmodel :ViewModel() {

    val count:LiveData<Int>
        get() = _count

    private var _count=MutableLiveData<Int>()

    init{
    _count.value =0;
    }
    fun increment(){
        _count.value= _count.value?.plus(1)
    }
    fun descrement(){
        _count.value= _count.value?.minus(1)
    }
    fun reset(){
        _count.value=0
    }
}