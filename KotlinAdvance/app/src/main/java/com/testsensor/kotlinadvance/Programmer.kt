package com.testsensor.kotlinadvance

class Programmer(name: String, age: Int, var language: String) : Person(name, age), Vehicle {
    //example of a programmer, he is a person and we can extent the person attributes and functionalities
    // now we have to redefine the contructor and  we need to pass to the super class the main parameters
    // this means that a programmer can not exits without peron parameters

    // to override a funtion from super class again that function have to have the key word open

    // we also are able to add more properties that a features for programmer for example programming languages need to be define var or val

    // it is also important to indicate that a class that alredy extend another class can just extend just one tim

    // to extend more funcionalitis is required use interfaces

    override fun work() {
        //super.work()// super inficates that it is a refereference to the superclass fuction
        println("This person is programming")
    }

    fun sayLanguage() {
        println("This Programmer use the language $language")

    }

    // the abtract funcionality also can be override from a child
    override fun goToWork() {
        println("This programmer go to google")
    }

    override fun drive() {
        println("This person drive a car")
    }


}