package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var etnumber1:EditText
    lateinit var etnumber2:EditText
    lateinit var btnadd: Button
    lateinit var btnmultiply: Button
    lateinit var btnsubtract: Button
    lateinit var btnmodulus: Button
    lateinit var tvResults: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnumber1=findViewById(R.id.etnumber1)
        etnumber2=findViewById(R.id.etnumber2)
        btnadd=findViewById(R.id.btnadd)
        btnmultiply=findViewById(R.id.btnmultiply)
        btnsubtract=findViewById(R.id.btnsubtract)
        btnmodulus=findViewById(R.id.btnmodulus)
        tvResults=findViewById(R.id.tvResults)
        btnadd.setOnClickListener {
            var number1 = etnumber1.text.toString().toInt()
            var number2=etnumber2.text.toString().toInt()
            add(number1,number2)
        }
        btnmultiply.setOnClickListener {
            var number1 = etnumber1.text.toString().toInt()
            var number2=etnumber2.text.toString().toInt()
            multiply(number1,number2)
        }
        btnsubtract.setOnClickListener {
            var number1 = etnumber1.text.toString().toInt()
            var number2=etnumber2.text.toString().toInt()
            subtract(number1,number2)
        }
        btnmodulus.setOnClickListener {
            var number1 = etnumber1.text.toString().toInt()
            var number2=etnumber2.text.toString().toInt()
            modulus(number1,number2)
        }
    }
    fun add(num1:Int,num2:Int){
       var number = num1+num2
       tvResults.text=number.toString()
    }
    fun multiply(num1:Int,num2:Int){
        var number = num1*num2
        tvResults.text=number.toString()
    }
    fun subtract(num1:Int,num2:Int){
        var number = num1-num2
        tvResults.text=number.toString()
}
    fun modulus(num1:Int,num2:Int){
        var number = num1%num2
        tvResults.text=number.toString()
 }
}