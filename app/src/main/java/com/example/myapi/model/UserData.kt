package com.example.myapi.model

data class UserData(
    val id :Int,
    var creationTimeSeconds:Long,
    var commentatorHandle:String,
    var locale: String,
    var text:String,
    var rating:Int
)
