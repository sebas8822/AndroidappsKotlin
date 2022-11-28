package com.testsensor.kotlinadvance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
// Tutorial youtube.com/watch?v=AA3N_yQQtHY&t=3165s

//Typealias that represents datatypes
typealias MyMapList = MutableMap<Int, ArrayList<String>>
// Typealias to represent fuctions
typealias Myfun = (Int, String, MyMapList) -> Boolean
//TypeAlias to represent nestedclass
typealias MyNestedClass = MyNestedAndInnerClass.MyNestedClass

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
        //ataClass()
        //Typealias
        //typeAlias()
        //Destructuring Declaration
        //destructuringDeclaration()
        //Extensions
        //extensions()


    }
}
//Leccion 9: Extensions -- Reusable code witout use heritage - the funtions that are extendet can be used as base on the new class
// Extention properties that can be used to add properties to the extesion  base

private fun extensions(){


    //extending functions
    val myDate = Date()
    println(myDate.customeFormat())
    println(myDate.formatSize)

    val myDateNullable: Date? = null
    println(myDateNullable.customeFormat())
    println(myDateNullable.formatSize)




}




//Leccion 8: Destructuring Declaration -- For efficiency
// structures in a unic element - Clean and Fast

private fun destructuringDeclaration() {

    //Applciaiton to dataclasses
    // val Sebas = Worker("Sebas", 34, "Programmer")
    // The concept destructuring mean as we see the variable Sebas with type values worker  can be separate in constants
    val (Name,Age,Work) = Worker("Sebas", 34, "Programmer")
    println("$Name, $Age, $Work")
    //this is another way to do it
    val Sebas = Worker("Sebas", 34, "Programmer")
    println(Sebas.component1())

    //can be applicable to fuctions
    val (NameWorker,AgeWorker,WorkWorker) = myWorker()
    println("$NameWorker, $AgeWorker, $WorkWorker")

    // It is also applicable to maps
    val myMap = mapOf(1 to "Sebas", 2 to "Ana", 3 to "Sara")
    //normal
    for (element  in myMap){
        println("Key: ${element.key}: value ${element.value}")
    }
    //another way
    for (element  in myMap){
        println("Key: ${element.component1()}: value ${element.component2()}")
    }
    //total destructuration
    for ((Key,Value) in myMap){
        println("$Key:$Value ")
    }

    //variables underscore - this way just allow to acces to the variables that are not underscore
    //this make sure that you are accesing without acces to the unnecessary one
    val (n,_,w) = Worker("Sebas", 34, "Programmer")
    println("$n, $w")


}

private fun myWorker(): Worker{
    return Worker("Sebas", 34, "Programmer")
}


//Leccion 7: Type Aliases - - it is amethod to call long types in a short way
// this improve functionality readibility and behaviour help to about to much repetion too

// This is a normal way

private var myMap: MutableMap<Int, ArrayList<String>> = mutableMapOf()

private var myMap2: MyMapList = mutableMapOf()

private fun typeAlias() {

    //tipical way to manage this
    //varatiable creation
    var myNewMap: MutableMap<Int, ArrayList<String>> = mutableMapOf()
    // values assignation
    myNewMap[1] = arrayListOf("Sebas", "Ramirez")
    myNewMap[2] = arrayListOf("Karen", "Joaqui")

    myMap =
        myNewMap // I can assign the same values to my other variable because are constructed the same

    // Now using typealias + this is declare as global variable usig typealias and defining the variable and type check up
    //varatiable creation
    var myNewMap2: MyMapList = mutableMapOf()
    // values assignation
    myNewMap2[1] = arrayListOf("Sebas", "Ramirez")
    myNewMap2[2] = arrayListOf("Karen", "Joaqui")

    myMap2 =
        myNewMap2 // I can assign the same values to my other variable because are constructed the same

    println(myMap2.toString())

}


//Lesson 6: Data Class share similar characteristics to normal classes the diference between them is that data class already has in-build functions that
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
    val sebas3 = sebas.copy(age = 35)
    println(sebas3.toString())

    //componentN
    val (name, age) = sebas
    println(name)
    println(age)

}


//Lesson 5: The classes, objects, interfaces, constructors, functions, properties, accessors(Get/set)
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

