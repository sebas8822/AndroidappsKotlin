package com.testsensor.datatypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        datatype()



    }

    private fun datatype() {

        // Strings

        val myString: String = "Hi there" // can be define with a specific type
        val myString2 = "how are you?" // results in the same datatype (string in this case)
        val myString3 = myString + " " +  myString2 + " I all right bro" + " How about you?" // this a chain of characters

        println(myString3)




    }


}