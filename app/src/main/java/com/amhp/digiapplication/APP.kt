package com.amhp.digiapplication

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module


class APP : Application() {

    override fun onCreate() {
        super.onCreate()


        val myModule = module {
        }

        startKoin {
            androidContext(this@APP)
            modules(myModule)
        }


    }
}