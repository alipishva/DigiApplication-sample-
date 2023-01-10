package com.amhp.digiapplication.repository

import retrofit2.Response

abstract class Repository {

    suspend fun <T : Any> customResponse(work : () -> Response<T>) : T {
        val response = work.invoke()
        if (response.isSuccessful) return response.body() !!
        throw Exception(response.message())
    }

}