package com.davthecoder.demosdk

import com.davthecoder.demosdk.di.DemoSdkComponent
import org.koin.core.component.inject

object DataConsumer {

    val greetings = Injection.greetings
    val greetingsFormatter = Injection.greetingsFormatter

    private object Injection : DemoSdkComponent{
        val greetings by inject<Greetings>()
        val greetingsFormatter by inject<GreetingsFormatter>()
    }
}