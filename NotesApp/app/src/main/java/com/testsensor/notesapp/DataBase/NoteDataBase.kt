package com.testsensor.notesapp.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.testsensor.notesapp.Models.Note
import com.testsensor.notesapp.Utilities.DATABASE_NAME

// this class is responsible to create the database and is Abstract because this need to be accessible throughout the application
@Database(entities = arrayOf(Note::class), version = 1, exportSchema = false)
abstract class NoteDataBase : RoomDatabase() {

    abstract fun getNoteDao(): NoteDao
    // Single time pattern + means only sigle object can be created of this class
    // at once the object is created, it will turn into a reference to the same object
    companion object {

        @Volatile
        private var INSTANCE: NoteDataBase? = null // varaible is created by NoteDataBase

        fun getDataBase(context: Context): NoteDataBase {
            return INSTANCE ?: synchronized(this) { // check if the instance is null if not return the object reference // synchronized support the method of single time pattern
                // constant that create the database
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDataBase::class.java,
                    DATABASE_NAME // here it is where the utility package is defined
                ).build()
                INSTANCE = instance
                instance

            }
        }

    }


}