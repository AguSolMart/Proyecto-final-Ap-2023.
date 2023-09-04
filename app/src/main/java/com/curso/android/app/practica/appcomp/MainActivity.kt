package com.curso.android.app.practica.appcomp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 : EditText = findViewById(R.id.editText1)
        val et1:String=text1.text.toString()
        val text2 : EditText = findViewById(R.id.editText2)
        val et2:String=text2.text.toString()
        val respuesta: TextView = findViewById(R.id.textView1)
        val resp:String=respuesta.text.toString()

        fun play(respuesta: TextView)
        {            if(et1 == et2)
            respuesta.text = respuesta.text.toString()

        }
        findViewById<Button?>(R.id.btn1).setOnClickListener {
            play(respuesta)
            println(resp)
        }
    }
}