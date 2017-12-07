package com.production.fursa.ktnotes.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * Created by Fursa Ilya on 07.12.2017.
 */
open class KNote() : RealmObject() {
    @PrimaryKey
    var noteId: Int = 0
    var noteTitle: String = ""
    var noteText: String = ""
    var createDate: Date? = null
    var expDate: Date? = null

    constructor(noteId: Int, noteTitle: String, noteText: String, createDate: Date?, expDate: Date?) : this() {
        this.noteId = noteId
        this.noteTitle = noteTitle
        this.noteText = noteText
        this.createDate = createDate
        this.expDate = expDate
    }

    constructor(noteId: Int, noteTitle: String, noteText: String) : this() {
        this.noteId = noteId
        this.noteTitle = noteTitle
        this.noteText = noteText
    }

    fun printNote(): String = "Note: {" +
            "ID: ${noteId} " +
            "TITLE: ${noteTitle} " +
            "TEXT: ${noteText} " +
            "CREATED: ${createDate} " +
            "EXPIRE: ${expDate}}"




}