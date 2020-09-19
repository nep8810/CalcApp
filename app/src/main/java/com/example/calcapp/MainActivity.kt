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
import android.renderscript.Sampler
import android.support.v7.app.AlertDialog
import android.text.TextUtils.isEmpty
import android.widget.Button
import com.example.calcapp.R
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.String.Companion as String
import android.widget.Toast
import android.widget.Toast.makeText
import android.support.v4.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ID:各buttonにbtn1～4という名前を割当
        val btn1 = this.findViewById(R.id.button1) as Button;btn1.setOnClickListener(this)
        val btn2 = this.findViewById(R.id.button2) as Button;btn2.setOnClickListener(this)
        val btn3 = this.findViewById(R.id.button3) as Button;btn3.setOnClickListener(this)
        val btn4 = this.findViewById(R.id.button4) as Button;btn4.setOnClickListener(this)

    }

//onClickメソッドでSecondActivityに遷移させる
    override fun onClick(v: View?) {
        //Intentのインスタンスを生成
        //コンストラクタの第一引数はcontextなのでActivity自身,第2引数は遷移させたいActivityのクラスを指定
        val intent = Intent(this, SecondActivity::class.java)

              if (editText1.text.isEmpty()){
                 makeText(this, "数値が入力されていません!!", Toast.LENGTH_SHORT).show()}
                  else if (editText2.text.isEmpty()){
                  makeText(this, "数値が入力されていません!!", Toast.LENGTH_SHORT).show()}
                  else {

                  //EditTextの文字列を取得し、数値に変換
                  val A = editText1.text.toString().toDouble()
                  val B = editText2.text.toString().toDouble()


                when (v?.id) {
                  R.id.button1 -> intent.putExtra("VALUE", (A + B))
                  R.id.button2 -> intent.putExtra("VALUE", (A - B))
                  R.id.button3 -> intent.putExtra("VALUE", (A * B))
                  R.id.button4 -> intent.putExtra("VALUE", (A / B))

                }
               }
        //生成したIntentを引数にしてstartActivityメソッドを呼び出すことで遷移
        startActivity(intent)
    }
}
