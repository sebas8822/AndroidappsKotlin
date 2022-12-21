package com.testsensor.notesapp.DataBase

import androidx.lifecycle.LiveData
import com.testsensor.notesapp.Models.Note

// this class serves as intermediate to our main activity as example
/**
 *This class isolates the data sources from the rest of the app and provides a clean API
 * for data access to the rest of the app. Using a repository class ensures this code is separate
 * from the ViewModel class, and is a recommended best practice
 * for code separation and architecture*
 * */

class NotesRepository(private val noteDao: NoteDao) {

    // this variable will containt all the notes in a for of live Data using the Dao Database
    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()


    // insert the note using the DAO
    suspend fun insert(note: Note) { // Note is the object
        noteDao.insert(note)

    }


    // Delete the note using the DAO
    suspend fun delete(note: Note){
        noteDao.delete(note)
    }

    //Update the note

    suspend fun update(note: Note){
        noteDao.update(note.id,note.title,note.note)

    }


}