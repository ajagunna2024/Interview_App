package com.example.crashlytics

import android.util.Log
// https://www.random.org/integers/?num=10&min=1&max=100&col=1&base=10&format=plain&rnd=new
class UncaughtExceptionManager : Thread.UncaughtExceptionHandler {
    override fun uncaughtException(t: Thread, e: Throwable) {
        e.printStackTrace()
        Log.e(TAG, "uncaughtException: ${e.message ?: "Unknown"}")
    }

    companion object {
        private const val TAG = "UncaughtExceptionManage"
    }
}