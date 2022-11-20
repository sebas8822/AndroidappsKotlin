package com.testsensor.kotlinadvance

private class Visibility {

    // when is not defined any key word of visibility this is public
    // if public is change to "private" won't get access depending of scope of the problem
    // it is recomended always private it can be access from the same file or class


    var name: String? = null

    fun sayMyname() {
        name?.let {// open the variable in case it is not null
            println("My name is $it")
        } ?: run {// if name is null (else)
            println("I don't have name")
        }


    }


}

open class VisibilityTWO {

    // notice that the class visibility can be instanced from another calls from the same class
     protected fun sayMyNameTWO() {
        val visibility = Visibility()
        visibility.name = "Sebas"
        visibility.sayMyname()
    }

}
class VisibilityTHREE: VisibilityTWO(){

    // notice that the class visibility can be instanced from another calls from the same class
    fun sayMyNameTHRE() {
        sayMyNameTWO()
    }

}
