package com.example.myapi.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object{
        private var retrofit: Retrofit? = null
        private var gson : Gson? = null

        fun GetClient():Retrofit?{
            if(gson == null){
                gson = GsonBuilder()
                    .setLenient()
                    .create()
            }
            if(retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl("https://codeforces.com/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit
        }
    }
}