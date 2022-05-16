package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class calculatorapp : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiplication:Button
    lateinit var btnModulus:Button

    lateinit var etNumber:TextView
    lateinit var etNumber2:TextView

    lateinit var tvAnswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatorapp)

        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiplication = findViewById(R.id.btnmultiplication)
        btnModulus = findViewById(R.id.btnModulus)

        etNumber = findViewById(R.id.etNumber)
        etNumber2 = findViewById(R.id.etNumber2)

        tvAnswer = findViewById(R.id.tvAnswer)

        btnAdd.setOnClickListener {
            val Number = etNumber.text.toString()
            val Number2 = etNumber2.text.toString()

            if(Number.isBlank()){
                etNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (Number2.isBlank()){
                etNumber2.setError("Number2 is required")
                return@setOnClickListener
            }
            addition(Number.toInt(), Number2.toInt())

        }
        btnSubtract.setOnClickListener {
            val Number = etNumber.text.toString()
            val Number2 = etNumber2.text.toString()

            if(Number.isBlank()){
                etNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (Number2.isBlank()){
                etNumber2.setError("Number2 is required")
                return@setOnClickListener
            }
            subtraction(Number.toInt(),Number2.toInt())

        }

        btnMultiplication.setOnClickListener {
            val Number = etNumber.text.toString()
            val Number2 = etNumber2.text.toString()

            if(Number.isBlank()){
                etNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (Number2.isBlank()){
                etNumber2.setError("Number2 is required")
                return@setOnClickListener
            }
            multiplication(Number.toInt(),Number2.toInt())

        }

        btnModulus.setOnClickListener {
            val Number = etNumber.text.toString()
            val Number2 = etNumber2.text.toString()

            if(Number.isBlank()){
                etNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (Number2.isBlank()){
                etNumber2.setError("Number2 is required")
                return@setOnClickListener
            }
            modulus(Number.toInt(),Number2.toInt())

        }
    }

    fun addition(Number:Int,Number2:Int){
        var add = Number + Number2
        tvAnswer.text = add.toString()
    }

    fun subtraction(Number:Int,Number2:Int){
        var add = Number - Number2
        tvAnswer.text = add.toString()
    }

    fun multiplication(Number:Int,Number2:Int){
        var add = Number * Number2
        tvAnswer.text = add.toString()
    }

    fun modulus(Number:Int,Number2:Int){
        var add = Number % Number2
        tvAnswer.text = add.toString()
    }

}