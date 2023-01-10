package com.amhp.digiapplication.service

import com.amhp.digiapplication.repository.Repository
import retrofit2.Response

object HandelRequest : Repository() {

    suspend fun <T : Any> request(response : Response<T>) = customResponse {
        response
    }

}