package com.testsensor.kotlinadvance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Enum Class
        //enumClasses()
        // Nested and Inner Classes
        //nestedAndInnerClass()
        //Heritage
        //heritageClasses()
        //Interfaces
        //interfaces()
        //Visibility Modifiers
        //visibilityModifiers()
        //Data Classes
        dataClass()


    }
}

//Lesson 4: Data Class share similar characteristics to normal classes the diference between them is that data class already has in-build functions that
//allows to work with data and the efficiency is better than normal class
private fun dataClass() {
    val sebas = Worker("Sebas", 16, "Programmer")
    sebas.lastWork = "Electronic Engineer"

    val karen = Worker("Karen", 16, "Programmer")
    sebas.lastWork = "Electronic Engineer"

    //operations that we can use with data class "equals" and "hashCode
    //Equal-> this compare two objects if they are equal
    if (sebas.equals(karen)) {
        println("Are Equals")
    } else {
        println("Are not Equals")
    }

    //ToString
    println(sebas.toString())

    //copy -> make a copy of a object
    val sebas2 = sebas.copy()
    println(sebas2.toString())
    //**Copy-> we can also copy and change properties
    val sebas3 = sebas.copy(age=35)
    println(sebas3.toString())

    //componentN
    val (name, age) = sebas
    println(name)
    println(age)

}


//Lesson 4: The classes, objects, interfaces, constructors, functions, properties, accessors(Get/set)
//can have visibility modifiers
// keywords "Private", "protected", "internal", "public"

//Private -> can be accessed just from the same file or class
//Protected -> can be accessed same to private but it not going to be accible from superior clasess but for inferior clasess yes
//Public -> can be accessed from everywhere
//Internal -> it is visible from everywhere of the "MODULE" like our app in our case

// this bring the concept of immutability allow just to be modified when just is required

private fun visibilityModifiers() {

    //val visibility = Visibility()
    //visibility.name = "Sebas"
    //visibility.sayMyname()

}

//Lesson 4:Interfaces can contain abstract declarations or implementations of functions or properties
// the difference with abatract classes is that the interfaces can never storage any state
// they are used through classes
private fun interfaces() {

    val gamer = Person("Sebas", 34)
    println(gamer.name)
    gamer.play()// see it is aaccess and modified from peroson class
    gamer.stream()// see this come from the interface directly


}

//Lesson 3: Heritage - it is a mechanism that of languges OOP in classes - a class is derivated from other
//extends their functionality or specialized
private fun heritageClasses() {

    // we can also create  a person
    val person = Person("Angela", 31)
    println(person.name)
    person.work()
    person.goToWork()

    //let's see creatin a programmer and designer
    val programmer = Programmer("Sebas", 34, "Kotlin")
    println(programmer.name)
    programmer.work()
    programmer.sayLanguage()
    programmer.goToWork() // obligated function determined from abstract class work
    programmer.drive()

    val designer = Designer("Karen", 16)
    println(designer.name)
    designer.work() // we can see the function taken from person or defined in person
    designer.goToWork()

}


//Lesson 2: Inner and Inner Class (Scopes )
private fun nestedAndInnerClass() {
    // my nested class
    val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
    val sum = myNestedClass.sum(30, 50)
    println("The Sum result is: $sum")
    // my Inner Class
    val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
    val sumTwo = myInnerClass.sumTwo(5)
    println("My Fuction in Inner class value: $sumTwo")


}


//Lesson 1: Enum Classes
/*They are to determine parameters safe or (TYPE SAFE)
* we can define class that are predefine
* */
enum class Direction(val dir: Int) {
    NORTH(1), SOUTH(-1), EAST(1), WEST(-1);

    //we can add fuctions
    fun description(): String {

        return when (this) {
            NORTH -> "The direction is North"
            SOUTH -> "The direction is South"
            EAST -> "The direction is EAST"
            WEST -> "The direction is WEST"
        }

    }

}


private fun enumClasses() {
    var userDirection: Direction? = null// if does not exits a value print null
    println("Direction $userDirection")

    // Change determine value
    userDirection = Direction.NORTH
    println("Direction $userDirection")

    userDirection = Direction.SOUTH
    println("Direction $userDirection")


    //Properties
    println("Property name: ${userDirection.name}")
    println("Property ordinal: ${userDirection.ordinal}")

    //Function
    println("Property ordinal: ${userDirection.description()}")

    //Tips enum Buid.in functions
    // println(Direction.valueOf("value"))
    println("Direction $userDirection")
    println(Direction.values().toList())// return array of the predetermne values

    // we can add properties to the values preditermine in the example was added dir
    println("Property dir of a current value: ${userDirection.dir}")


}

