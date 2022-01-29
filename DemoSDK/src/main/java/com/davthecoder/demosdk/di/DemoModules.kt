package com.davthecoder.demosdk.di

import com.davthecoder.demosdk.Greetings
import com.davthecoder.demosdk.GreetingsFormatter
import org.koin.dsl.module

private var demoAppModule = module {
    single { Greetings() }
    single { GreetingsFormatter(get()) }
}

val demoModules = listOf(demoAppModule)