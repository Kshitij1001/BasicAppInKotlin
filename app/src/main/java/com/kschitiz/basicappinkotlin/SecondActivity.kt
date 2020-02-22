package com.kschitiz.basicappinkotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val gotIntent = intent.extras
        Toast.makeText(this,"The message was ${gotIntent!!.getString("msg")}",Toast.LENGTH_SHORT).show()
        txtMsg.text = gotIntent.getString("msg")
    }
}