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
        //collections()
        //loops()
        //nullsafety()
        //functions()
        classes()

    }

    private fun classes() {
        TODO("Not yet implemented")
    }


    /*Fuctions are blocks that are executed in a sequence when they are call
    *
    * */
    private fun functions(){
        sayHellow()
        sayMyName("Sebas",)
        sayMyNameAndAge("Sebas",34)
        println(sumTwoNUmbers(30,80))
    }

    // Simple fuction
    fun sayHellow(){
        println("Hi there")
    }
    // Function with parameters
    fun sayMyName(Name: String){
        println("Hi there, $Name")
    }

    // Function with more htan 1 parameter
    fun sayMyNameAndAge(Name: String,Age: Int){
        println("Hi there, $Name your age is $Age")
    }

    // Function with a return
    fun sumTwoNUmbers(FirtNum: Int,SecondNum: Int) : Int{
        return FirtNum + SecondNum
    }


    /*
    * Here we can see an example
    * kotlin contain th function to indicate this error before to compile the program
    * Kotlin avoid this errors before copile the program avoiding this happen when the program, is running
    *
    *
    * */

    private fun nullsafety() {
        var myString = "Never stop to learn"
        //myString  = null // this generate an error
        println(myString)

        //how we can create a variable that can take the null value and continuing running with any
        //problem

        var myString2: String? = "This can be transformed and take null values"

        myString2 = null
        println(myString2)
        //this check is normarly in other programing languages
//        if (myString2 != null) {
//            println("$myString2")
//        } else {
//            println(myString2)
//        }
        // safety calls
        //the ? it is a conditional which indicates
        println(myString2?.length)
        //this is another way to call a variable null without call the excepetion
        myString2?.let {
            println("$it")
        }?: run{
            println(myString2)
        }


    }


    /*
    Loops allows to go throught data structures like  arrays or maps
    */
    private fun loops() {
        val myArray: List<String> =
            listOf("Hi", "welcome to this training", "Please never stop to learn")
        val myMaps: MutableMap<String, Int> =
            mutableMapOf("Sebas" to 34, "Angela" to 31, "Karen" to 16)

        //FOR

        for (element in myArray) {
            println(element)

        }

        for (element in myMaps) {
            println("${element.key} = ${element.value}")
        }

        // use range
        println(" with Range")
        for (i in 0..10) {
            println(i)
        }
        println(" with until")
        for (i in 0 until 10) {// no count 10
            println(i)
        }

        // with step

        println(" with step")
        for (i in 0..10 step 2) {
            println(i)

        }


        // with decreasing

        println(" with decreasing")
        for (i in 10 downTo 0) {
            println(i)
        }

        // with decreasing also with step

        println(" with decreasing")
        for (i in 10 downTo 0 step 2) {
            println(i)
        }


        //trick
        val myNumericArray = (0..100)
        for (elements in myNumericArray) {
            println(elements)
        }


        // Loop While

        var x = 0

        while (x <= 10) {
            println(x)
            x++

        }


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
        var myMap: Map<String, Int> = mapOf()

        println(myMap) // I'll show a empty map

        //Add elements to the map (This method creates a new map and delete the elements if they alredy exits)
        myMap = mutableMapOf(
            "Sebas" to 34,
            "Angela" to 31,
            "Karen" to 16
        )// mutable allows to add more varables na make changes
        println(myMap)

        //to add elemets to the exits maps
        myMap["Cata"] = 30 // shows a error because requires a mutable maps
        myMap.put("Cata", 30)
        println(myMap)

        // Updates or Changes to Maps (call the key and =)
        myMap.put("Cata", 32)
        println(myMap)

        //data access
        println(myMap["Cata"])

        //Delete Data
        myMap.remove("Cata")
        println(myMap)


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