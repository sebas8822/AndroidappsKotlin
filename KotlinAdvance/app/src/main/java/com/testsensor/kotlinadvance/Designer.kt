package com.testsensor.kotlinadvance

class Designer(name: String, age: Int): Person(name,age) {
    override fun work() {
        println("This person is designing")
        super.work() // the function is call and print the perosn is working
    }

}