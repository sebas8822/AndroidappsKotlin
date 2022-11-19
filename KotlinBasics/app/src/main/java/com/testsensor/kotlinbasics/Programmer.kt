package com.testsensor.kotlinbasics

class Programmer(
    val name: String,
    val age: Int,
    val languages: Array<Language>,
    val friends: Array<Programmer>? = null
) { // idicates friends can be null

    // can have properties
    //if we want o access to the variables we need to define if they are val or var
    //we can also create functions inside the classes

    //enum can define the languages that a programmer can have this means that can be define
    //parameters predifine so we can not pass different parameters that are aready defined

    enum class Language {
        Kotlin,
        Switch,
        Java,
        JavaScript
    }


    fun code() {
        languages.forEach {
            println("$name is programing in $it")
        }
    }


}