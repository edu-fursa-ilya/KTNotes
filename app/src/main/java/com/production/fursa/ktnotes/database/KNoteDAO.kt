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

    fun create(note: KNote) {
        realm.beginTransaction()
        realm.copyToRealmOrUpdate(note)
        realm.commitTransaction()
    }

    fun remove(noteId: Int) {
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
            Log.d(KNoteDAO::class.java.simpleName, it.printNote())
        }
    }

    fun clearAll() {
        realm.beginTransaction()
        realm.where(KNote::class.java).findAll().deleteAllFromRealm()
        realm.commitTransaction()
    }

}