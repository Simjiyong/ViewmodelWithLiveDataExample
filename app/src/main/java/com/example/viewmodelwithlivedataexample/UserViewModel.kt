package com.example.viewmodelwithlivedataexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val currentPhoneNum: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}