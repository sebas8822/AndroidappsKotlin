package com.testsensor.notesapp.DataBase

import androidx.lifecycle.LiveData
import androidx.room.*
import com.testsensor.notesapp.Models.Note


@Dao
interface NoteDao {

    // functions

    @Insert(onConflict = OnConflictStrategy.REPLACE) // if it is already a conflict remplace
    suspend fun insert(note : Note)

    @Delete
    suspend fun delete(note : Note)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes() : LiveData<List<Note>>

    @Query("UPDATE notes_table Set title = :title, note = :note where id = :id")
    suspend fun update(id: Int?, title : String?, note : String? )



}