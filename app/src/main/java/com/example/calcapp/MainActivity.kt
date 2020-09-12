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
import com.example.calcapp.R
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.String.Companion as String


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

          //EditTextの文字列を取得し、数値に変換
          val A = editText1.text.toString().toDouble()
          val B = editText2.text.toString().toDouble()

         when(v?.id){
             R.id.button1 -> intent.putExtra("VALUE", (A + B))
             R.id.button2 -> intent.putExtra("VALUE", (A - B))
             R.id.button3 -> intent.putExtra("VALUE", (A * B))
             R.id.button4 -> intent.putExtra("VALUE", (A / B))

            else -> textView.text = "何か数値を入力してください"
        }

        //生成したIntentを引数にしてstartActivityメソッドを呼び出すことで遷移
        startActivity(intent)
    }
}

