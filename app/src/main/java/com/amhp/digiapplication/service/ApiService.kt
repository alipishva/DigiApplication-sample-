package com.amhp.digiapplication.service

import com.amhp.digiapplication.model.ModelHome
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {

    @GET("home.php")
    suspend fun getHome() : Response<ModelHome>


    companion object {
        operator fun invoke() : ApiService {

            return Retrofit.Builder().baseUrl("http://192.168.1.59/digikala/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
    }
}