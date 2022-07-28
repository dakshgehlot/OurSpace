package com.example.ourspace.ui.contact_us

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactUsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        // value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}