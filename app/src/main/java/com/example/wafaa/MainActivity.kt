package com.example.wafaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var toabt:Button
    lateinit var tvbt: Button
    lateinit var gobt: Button
    lateinit var edname: EditText
    lateinit var edloc:EditText
    lateinit var edmob:EditText
    lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toabt=findViewById(R.id.button)
        tvbt=findViewById(R.id.button2)
        gobt=findViewById(R.id.button3)
        edname=findViewById(R.id.editTextTextPersonName)
        edloc=findViewById(R.id.editTextTextPersonName2)
        edmob=findViewById(R.id.editTextTextPersonName3)
        tv=findViewById(R.id.textView)

        toabt.setOnClickListener {
     Toast.makeText(applicationContext,"${edname.text.toString()}${edloc.text.toString()}${edmob.text.toString()}",Toast.LENGTH_SHORT)

    }
    tvbt.setOnClickListener {
        tv.text="${edname.text}${edloc.text}${edmob.text}"
    }
    gobt.setOnClickListener{
        val intent= Intent(this, MainActivity2::class.java)
        intent.putExtra("marvel",edname.text.toString())
        intent.putExtra("marvel",edloc.text.toString())
        intent.putExtra("marvel",edmob.text.toString())


        startActivity(intent)
    }
}}