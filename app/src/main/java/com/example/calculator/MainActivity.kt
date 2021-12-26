package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textRes: TextView? = null
    private lateinit var edit1: EditText
    private lateinit var edit2: EditText
    private lateinit var pluss: Button
    private lateinit var minuss: Button
    private lateinit var umnojenie: Button
    private lateinit var delenie: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textRes = findViewById(R.id.result)


        edit2 = findViewById(R.id.editText2)
        pluss = findViewById(R.id.plus)
        minuss = findViewById(R.id.minus)
        umnojenie = findViewById(R.id.multiplication)
        delenie = findViewById(R.id.division)

        pluss.setOnClickListener {
            try {
                val firstEdit: Double = edit1.text.toString().toDouble()
                val secondEdit: Double = edit2.text.toString().toDouble()
                val answer: Double = (firstEdit + secondEdit)
                textRes?.text = answer.toString()
            } catch (e: Exception) {
                textRes?.text = "Ошибка!"
            }
        }

        minuss.setOnClickListener {
            try {
                val firstEdit: Double = edit1.text.toString().toDouble()
                val secondEdit: Double = edit2.text.toString().toDouble()
                val answer: Double = (firstEdit - secondEdit)
                textRes?.text = answer.toString()
            } catch (e: Exception) {
                textRes?.text = "Ошибка!"
            }
        }

        umnojenie.setOnClickListener {
            try {
                val firstEdit: Double = edit1.text.toString().toDouble()
                val secondEdit: Double = edit2.text.toString().toDouble()
                val answer: Double = (firstEdit * secondEdit)
                textRes?.text = answer.toString()
            } catch (e: Exception) {
                textRes?.text = "Ошибка!"
            }
        }

        delenie.setOnClickListener {
            try {
                val firstEdit: Double = edit1.text.toString().toDouble()
                val secondEdit: Double = edit2.text.toString().toDouble()
                val answer: Double = (firstEdit / secondEdit)
                textRes?.text = answer.toString()
            } catch (e: Exception) {
                textRes?.text = "Ошибка!"
            }
        }


    }
}