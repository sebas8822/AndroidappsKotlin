package com.testsensor.variables

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.testsensor.variables.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        variablesAndConstants()


        }

    /*
       * This is another way to create comments
       * This Fuction declare var and
       * */
    private fun variablesAndConstants(){

        //variables

        /*If a variable is declare the first time with a variable type (string, number etc )
         the type can not be changed
         */

        var myFirstVariable = "Hello there petty boy"
        println(myFirstVariable)
        //myFirstVariable = 1 -> this produce a error

        // we can define variables with other variables for example

        var mySecondVariable = "Never stop to learn"

        println("$myFirstVariable I have message to you: $mySecondVariable !!!")

        mySecondVariable = myFirstVariable



        println("$myFirstVariable I have message to you: $mySecondVariable !!! what? are you right?")

        // Constants

        val myFirstConstant = "I never going to change, I'll keep going studying"

        println(myFirstConstant)

        //myFirstConstant = "Stop to learn" // show error can not reassign






    }



    }

