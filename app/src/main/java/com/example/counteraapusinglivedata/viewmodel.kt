package com.example.counteraapusinglivedata

import androidx.lifecycle.ViewModel

class viewmodel :ViewModel() {
    var count:Int =0;
    fun increment(){
        count++
    }
    fun descrement(){
        count--
    }
    fun reset(){
        count=0
    }
}