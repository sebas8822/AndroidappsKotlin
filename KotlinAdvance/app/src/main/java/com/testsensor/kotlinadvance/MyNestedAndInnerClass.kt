package com.testsensor.kotlinadvance

class MyNestedAndInnerClass {

    val one = 1 // this value can be access from inner class

    private fun returneOne(): Int{
        return one
    }


    //Nested Class
    // A class is contained inside another class or main class
    class MyNestedClass {
        fun sum(first: Int, second: Int): Int {
            return first + second

        }
    }

    //Inner Class
    // inner class can take funtions and values defined in the main class
    inner class MyInnerClass {

        fun sumTwo(num: Int) :Int{
            return num + one + returneOne()
        }


    }



}