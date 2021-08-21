package com.example.myapi

import com.example.myapi.model.UserData
import com.example.myapi.retrofit.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class NetworkHelper(private val apiClient:Retrofit) {
    fun getClasses(listener: NetworkListener){
        val call:Call<List<UserData>> = apiClient.create(ApiInterface::class.java).getClasses()
        call.enqueue(object :Callback<List<UserData>>{
            override fun onResponse(
                call: Call<List<UserData>>?,
                response: Response<List<UserData>>?
            ) {
                listener.onUserDataResponse(response?.body())
            }

            override fun onFailure(call: Call<List<UserData>>?, t: Throwable?) {
                listener.onUserDataFailure(t?.localizedMessage)
            }

        })
    }
}