package com.amhp.digiapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amhp.digiapplication.model.ModelHome
import com.amhp.digiapplication.service.HandelCoroutines
import com.amhp.digiapplication.service.HandelRequest
import com.amhp.digiapplication.service.ApiService
import kotlinx.coroutines.Job

class MainViewModel() : ViewModel() {
    val homeSliderLiveData = MutableLiveData<ModelHome>()
    lateinit var job : Job

    fun getHome() {
        job = HandelCoroutines.myThreadMain({
            HandelRequest.request(ApiService.invoke().getHome())
        } , {
            homeSliderLiveData.value = it
        })
    }

    override fun onCleared() {
        super.onCleared()
        if (::job.isInitialized)
            job.cancel()
    }
}