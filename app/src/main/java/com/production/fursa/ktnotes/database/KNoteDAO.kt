package com.production.fursa.ktnotes.database

import android.util.Log
import com.production.fursa.ktnotes.model.KNote
import io.realm.Realm
import io.realm.RealmResults

/**
 * Created by Fursa Ilya on 07.12.2017.
 * Simple DAO for Realm DB
 */
class KNoteDAO {
    private var realm: Realm = Realm.getDefaultInstance()

    fun save(note: KNote) {
        realm.beginTransaction()
        realm.copyToRealmOrUpdate(note)
        realm.commitTransaction()
    }

    fun removeById(noteId: Int) {
        realm.beginTransaction()
        realm.where(KNote::class.java).equalTo("noteId", noteId).findAll().deleteAllFromRealm()
        realm.commitTransaction()
    }

    fun printAll() {
        var notes: RealmResults<KNote> = realm.where(KNote::class.java).findAll()
        if(notes.isEmpty()) {
            Log.d(KNoteDAO::class.java.simpleName, "db - empty")
        }
        notes.forEach{
            Log.d(KNoteDAO::class.java.simpleName, "Title = ${it.noteTitle}")
            Log.d(KNoteDAO::class.java.simpleName, "Priority = ${it.notePriority}")
            Log.d(KNoteDAO::class.java.simpleName, "Text = ${it.noteText}")
            Log.d(KNoteDAO::class.java.simpleName, "Created = ${it.createDate}")
            Log.d(KNoteDAO::class.java.simpleName, "Expire = ${it.expDate}")
            Log.d(KNoteDAO::class.java.simpleName, "-------------------------")

        }
    }

    fun removeAll() {
        realm.beginTransaction()
        realm.where(KNote::class.java).findAll().deleteAllFromRealm()
        realm.commitTransaction()
    }

}