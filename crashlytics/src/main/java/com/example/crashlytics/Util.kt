package com.example.crashlytics

import android.os.Looper


fun <T : Exception?> throwOnMainThread(exception: T) {
    val mainThread = Looper.getMainLooper().thread
    mainThread.uncaughtExceptionHandler?.uncaughtException(mainThread, exception as Throwable)
}