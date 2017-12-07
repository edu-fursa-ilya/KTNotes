package com.production.fursa.ktnotes

import android.app.Application
import io.realm.Realm

/**
 *
 * Application class, entry point of our app
 * contains initRealm method(to init Realm DB instance)
 * @author Fursa Ilya on 07.12.2017.
 * @email: fursa.ilya@gmail.com
 *
 */
class KTApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initRealm()
    }

    private fun initRealm() = Realm.init(this)
}