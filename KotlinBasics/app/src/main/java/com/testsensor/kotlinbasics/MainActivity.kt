package com.testsensor.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.security.Principal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //useOfWhen2()
        //useOfWhen()
        //arrays()
        collections()

    }


    /*
    * This function explore the collection also call maps or dictionaries in kotlin
    * Features
    * * no repeated elements
    * * no ordered
    * * elements need key and value
    * * all elements need to be the same type data (KEY and VAlUES) but key and value  don't need to be
    *   the same type data
    * * keys can not be repeated
    * * elements are accessed by the keys
    * */
    private fun collections() {
        // create a map or dicctionary
        var myMap: Map<String,Int> = mapOf()

        println(myMap) // I'll show a empty map

        //Add elements to the map (This method creates a new map and delete the elements if they alredy exits)
        myMap = mutableMapOf("Sebas" to 34, "Angela" to 31, "Karen" to 16)// mutable allows to add more varables na make changes
        println(myMap)

        //to add elemets to the exits maps
        myMap["Cata"] = 30 // shows a error because requires a mutable maps
        myMap.put("Cata",30)
        println(myMap)

        // Changes to Maps (call the key and =)
        myMap.put("Cata",32)
        println(myMap)

        //data access
        







    }

    /*
    * The next functions is going to
    * the arrays are a collection of elements that are ordered and we can possess repeated elements
    * */
    private fun arrays() {
        val name = "Johan"
        val surname = "Ramirez"
        val company = "CSU"
        val age = "34"

        // Array creation
        //String indicates the type of data that we are going ot store
        val myArray: ArrayList<String> = arrayListOf<String>()

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)


        //to access to the values in array is used the Index

        println(myArray[0])// it will print the first position

        //Array data modification

        myArray[3] = "35"//acces to the position 4
        println(myArray)

        //Remove data

        myArray.removeAt(3)
        println(myArray)
        myArray.add(age)
        println(myArray)

        //Go trought the data

        for (value in myArray) {
            println(value)
        }

        myArray.forEach {
            println(it)
        }

        //Arrays operations
        println(myArray.first())
        println(myArray.last())



        println(myArray.count()) //count number of elements
        myArray.clear()
        println(myArray.count())


    }


    //this  Method is similar to other programming languages called switch
    private fun useOfWhen() {

        val country = "Spain"

        when (country) {

            "Spain" -> {
                println("The language is spanish but is funny")
            }
            "Colombia" -> {
                println("The language is spanish but is quick")
            }
            "Peru" -> {
                println("The language is spanish but is like a song")
            }
            "Mexico" -> {
                println("The language is spanish and it is spice haha")
            }
            else -> {
                println("The language is unknown")
            }

        }


    }


    //this  Method is similar to other programming languages called switch
    private fun useOfWhen2() {

        val country = "Spain"

        when (country) {
            // if we have the same result for different parameters we can use the next method
            //we can separate the possible parameters with commas
            "Mexico", "Peru", "Spain" -> {
                println("The language is spanish but is funny")
            }
            "EEUU" -> {
                println("The language is english but is quick")
            }
            else -> {
                println("The language is unknown")
            }

        }


        // now we can use when with range of numbersva
        val age = 29

        when (age) {
            in 0..3 -> {
                println("You can talk")
            }
            in 4..30 -> {
                println("Young for ever")
            }
            else -> {
                println("It is too old")
            }


        }


    }


}