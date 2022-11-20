package com.testsensor.kotlinadvance

open class Person (val name: String, age: Int): Work(),Game{
    // in Kotlin heritage any class has a superclass "ANY" for example "toString"
    // with the keyword "open" tell to the system that this class will be open to be extended

    open fun work(){
        println("This person is working")
    }

    override fun goToWork() {
        println("This person go to work")
    }

    // Interface use  -> see we have to extend or call the interface obligate everything from the interface
    override val game: String = "Among us"
    override fun play() {
        println("This person is playing $game")
    }
    /*
    override fun stream() { // this is optional
        super.stream()
    }*/

}