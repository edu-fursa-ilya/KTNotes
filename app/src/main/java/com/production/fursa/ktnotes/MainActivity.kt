package com.production.fursa.ktnotes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.production.fursa.ktnotes.database.KNoteDAO
import com.production.fursa.ktnotes.model.KNote
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var noteDAO: KNoteDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteDAO = KNoteDAO()
        noteDAO.create(KNote(1,"Note title 1", "Note text 1", Date(), Date()))
        noteDAO.create(KNote(2,"Note title 2", "Note text 2", Date(), Date()))
        noteDAO.create(KNote(3,"Note title 3", "Note text 3", Date(), Date()))

        Log.d(KNoteDAO::class.java.simpleName, "clear list....")
        noteDAO.printAll()
        noteDAO.clearAll()
        noteDAO.printAll()
    }
}
