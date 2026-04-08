package com.rag.basicmvvm

import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    var Count =0
    fun incCount(){
        Count++
    }
}