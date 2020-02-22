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
        val intentTo2ndActivity = Intent(this,SecondActivity::class.java)
        btnNxtActivity.setOnClickListener {
            yo = enterMsg.text.toString()
            Toast.makeText(this,"You entered $yo",Toast.LENGTH_SHORT).show()
            intentTo2ndActivity.putExtra("msg", yo)
            startActivity(intentTo2ndActivity)
        }

        btnShare.setOnClickListener {
            yo = enterMsg.text.toString()
            val shareActivity = Intent()
            shareActivity.action = Intent.ACTION_SEND
            shareActivity.putExtra(Intent.EXTRA_TEXT, yo)
            shareActivity.type = "text/plain"
            startActivity(Intent.createChooser(shareActivity,"Share to: "))
        }
    }
}