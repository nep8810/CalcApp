package com.example.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*
import android.widget.Toast
import android.widget.Toast.makeText
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value = intent.getDoubleExtra("VALUE", 0.0)

        textView.text = "${value}"
    }
}
