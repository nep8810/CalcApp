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

        val value1 = intent.getIntExtra("VALUE1",  0)
        val value2 = intent.getIntExtra("VALUE2", 0)


        when(R.id){
            R.id.button1 -> textView.text = "${value1 + value2}"
            R.id.button2 -> textView.text = "${value1 - value2}"
            R.id.button3 -> textView.text = "${value1 * value2}"
            R.id.button4-> textView.text = "${value1 / value2}"
            else -> textView.text ="何か数値を入力してください"

        }

    }
}
