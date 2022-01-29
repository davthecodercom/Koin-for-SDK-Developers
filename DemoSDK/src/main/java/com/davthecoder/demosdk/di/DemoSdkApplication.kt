package com.davthecoder.demosdk.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.Koin
import org.koin.dsl.koinApplication

object DemoSdkApplication {
    private var _koin : Koin? = null
    val koin get() = _koin!!

    @Synchronized
    fun init(context: Context) {
        if (_koin == null) {
            _koin = koinApplication {
                androidContext(context)
                modules(demoModules)
            }.koin
        }
    }

    @Synchronized
    fun close() {
        _koin?.close()
        if (_koin != null) {
            _koin = null
        }
    }
}