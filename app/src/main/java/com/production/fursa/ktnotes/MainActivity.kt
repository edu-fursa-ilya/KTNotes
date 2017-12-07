package com.production.fursa.ktnotes

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.production.fursa.ktnotes.model.KNote
import com.production.fursa.ktnotes.mvp.IMainActivityView

class MainActivity : MvpAppCompatActivity(), IMainActivityView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onNotesLoaded(notes: List<KNote>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onViewUpdate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSearchResult(notes: List<KNote>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAllNotesDeleted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNoteDeleted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showInfoDialog(note: KNote) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideInfoDialog() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
