package com.example.interviewapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.crashlytics.throwOnMainThread

class MainViewModel : ViewModel() {

    fun triggerUncaughtException() {
        throwOnMainThread(RuntimeException("This is just a test."))
    }
}