package com.example.myapi.retrofit

import com.example.myapi.model.Result
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("blogEntry.comments?")
    fun getClasses(@Query("blogEntryId") id:Int):Call<Result>

}