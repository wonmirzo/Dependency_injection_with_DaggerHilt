package com.wonmirzo.di

import android.app.Application
import com.wonmirzo.di.utils.SampleClass
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class DIApplication : Application() {
    @Inject
    lateinit var sampleClass: SampleClass

    override fun onCreate() {
        super.onCreate()
        sampleClass.doSomething()
    }
}