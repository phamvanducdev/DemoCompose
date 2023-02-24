package com.ducpv.demo

import android.app.Application
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize

/**
 * Created by pvduc9773 on 12/02/2023.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Firebase.initialize(applicationContext)
        Firebase.crashlytics.setCrashlyticsCollectionEnabled(true)
    }
}