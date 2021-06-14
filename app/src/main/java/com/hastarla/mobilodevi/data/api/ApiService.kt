package com.hastarla.mobilodevi.data.api

import com.hastarla.mobilodevi.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<MutableList<User>>
}