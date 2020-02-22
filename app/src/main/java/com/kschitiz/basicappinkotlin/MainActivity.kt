package com.kschitiz.basicappinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnToast.setOnClickListener {
            Toast.makeText(this,"Button pressed",Toast.LENGTH_SHORT).show()
        }
        var yo = ""
        btnNxtActivity.setOnClickListener {
            yo = enterMsg.text.toString()
            Toast.makeText(this,"You entered $yo",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }
}