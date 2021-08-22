package com.example.myapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapi.model.Result
import com.example.myapi.retrofit.ApiClient
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity(),NetworkListener {
    private val adapter=UserDataAdapter()
    private lateinit var networkHelper: NetworkHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val userId = intent.getStringExtra("user_id")!!
        recyclerView.adapter = adapter
        networkHelper = NetworkHelper(ApiClient.getClient())
        setData(userId.toInt())
    }
    private fun setData(userId:Int){
        networkHelper.getClasses(this,userId)
    }

    override fun onUserDataResponse(models: List<Result>) {
         adapter.models = models
    }

    override fun onUserDataFailure(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}