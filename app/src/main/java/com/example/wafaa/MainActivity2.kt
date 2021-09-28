package com.example.wafaa


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
class MainActivity2 : AppCompatActivity() {
lateinit var tv2:TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tv2=findViewById(R.id.textView2)

        val str1= intent.getStringExtra("marvel")
        val str2= intent.getStringExtra("dc")
        val str3= intent.getStringExtra("wb")
tv2.text="$str2 $str2 $str3"
    }
}