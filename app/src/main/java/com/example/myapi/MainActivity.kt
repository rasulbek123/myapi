package com.example.myapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    btnGet.setOnClickListener {
        var intent = Intent(this,MainActivity2::class.java)
           intent.putExtra("user_id",InputId.text.toString())
        startActivity(intent)

    }
    }

}