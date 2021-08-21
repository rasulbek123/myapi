package com.example.myapi.retrofit

import com.example.myapi.model.UserData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/api")
    fun getClasses():Call<List<UserData>>

}