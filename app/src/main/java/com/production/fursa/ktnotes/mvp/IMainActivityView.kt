package com.production.fursa.ktnotes.mvp

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.production.fursa.ktnotes.model.KNote

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface IMainActivityView : MvpView {

    fun onNotesLoaded(notes: List<KNote>)

    fun onViewUpdate()

    fun onSearchResult(notes: List<KNote>)

    fun onAllNotesDeleted()

    fun onNoteDeleted()

    fun showInfoDialog(note: KNote)

    fun hideInfoDialog()

}