package com.testsensor.kotlinadvance

import java.text.SimpleDateFormat
import java.util.*


// this extend a function that is already in-build in the system

fun Date?.customeFormat(): String? {
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mmssZZZ", Locale.getDefault())
    if (this != null){
        return formatter.format(this)
    }
    return null
}

// Extending a property
// this cosntant indicate the size of the date type string

val Date?.formatSize: Int
    get() = this.customeFormat()?.length?:0


