package com.example.myapi

import com.example.myapi.model.UserData

interface NetworkListener {
    fun onUserDataResponse(models:List<UserData>?)
    fun onUserDataFailure(message:String?)
}