package com.hastarla.mobilodevi.data.repository

import com.hastarla.mobilodevi.data.api.RetrofitBuilder

class MainRepository {
    suspend fun getUsers() = RetrofitBuilder.api.getUsers()
}