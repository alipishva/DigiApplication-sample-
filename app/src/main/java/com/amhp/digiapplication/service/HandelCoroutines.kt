package com.amhp.digiapplication.service

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

object HandelCoroutines {

    fun <T : Any> myThreadMain(work : suspend (() -> T) , myCallBack : ((T) -> Unit)) =
        CoroutineScope(Dispatchers.Main).launch {
        val data = CoroutineScope(Dispatchers.IO).async rt@{
            return@rt work()
        }.await()
        myCallBack(data)
    }

}