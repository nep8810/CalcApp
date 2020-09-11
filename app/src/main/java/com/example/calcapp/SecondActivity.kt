package com.example.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getFloatExtra("VALUE1", 0F)
        val value2 = intent.getFloatExtra("VALUE2", 0F)

        textView1.text = "${value1 + value2}"
        textView2.text = "${value1 - value2}"
        textView3.text = "${value1 * value2}"
        textView4.text = "${value1 / value2}"
    }
}

