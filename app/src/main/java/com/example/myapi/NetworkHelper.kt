package com.example.myapi

import com.example.myapi.retrofit.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class NetworkHelper(private val apiClient:Retrofit) {
    fun getClasses(listener:NetworkListener,userId:Int){
        val call= apiClient.create(ApiInterface::class.java).getClasses(userId)
        call.enqueue(object :Callback<UserData>{
            override fun onResponse(
                call: Call<UserData>?,
                response: Response<UserData>?
            ) {
                listener.onUserDataResponse(response?.body()!!.result)
            }

            override fun onFailure(call: Call<UserData>?, t: Throwable?) {
                listener.onUserDataFailure(t?.localizedMessage)
            }

        })
    }
}