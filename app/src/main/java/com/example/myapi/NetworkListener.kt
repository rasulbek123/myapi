package com.example.myapi

import com.example.myapi.model.Result

interface NetworkListener {
    fun onUserDataResponse(models:Result?)
    fun onUserDataFailure(message:String?)
}