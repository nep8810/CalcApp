package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.support.v4.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    //onClickメソッドでSecondActivityに遷移させる
    override fun onClick(v: View?) {
        //Intentのインスタンスを生成
        //コンストラクタの第一引数はcontextなのでActivity自身,第2引数は遷移させたいActivityのクラスを指定
        val intent = Intent(this, SecondActivity::class.java)

        intent.putExtra("VALUE1",  "@+id/editText1")
        intent.putExtra("VALUE2", "@+id/editText2")

        //生成したIntentを引数にしてstartActivityメソッドを呼び出すことで遷移
        startActivity(intent)
    }
}

