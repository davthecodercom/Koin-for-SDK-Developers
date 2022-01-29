package com.davthecoder.demosdk

import com.davthecoder.demosdk.DataConsumer.greetings

class GreetingsFormatter(greetings: Greetings) {

    fun sayHiWithName() = "Hi my friend, ${greetings.name}"

}