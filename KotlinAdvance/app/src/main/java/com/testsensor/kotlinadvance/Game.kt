package com.testsensor.kotlinadvance

interface Game {

    //iterfaces can have abstract fuction or implementation function

    //also allow to implement properties

    val game: String //property game

    fun play() // abstract Function

    fun stream(){// implementation function
        println("I am streaming of my $game ")
    }



}