package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

enum class CalculatorMode {
    Addition, Subtraction, Multiply, None
}

class MainActivity : AppCompatActivity() {
    var currentMode = CalculatorMode.None;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_add.setOnClickListener {
            currentMode = CalculatorMode.Addition
        }
        btn_sub.setOnClickListener {
            currentMode = CalculatorMode.Subtraction
        }
        btn_multiply.setOnClickListener {
            currentMode = CalculatorMode.Multiply
        }
        btn_equals.setOnClickListener {
            if (ed_firstvalue.text.toString().isEmpty()) {
                ed_firstvalue.setError("Enter first value..!")
            } else if (ed_secondvalue.text.toString().isEmpty()) {
                ed_firstvalue.setError("Enter Second value..!")
            } else {
                calculate()
            }

        }
    }

    private fun calculate() {
        val num1 = Integer.parseInt(ed_firstvalue.text.toString())
        val num2 = Integer.parseInt(ed_secondvalue.text.toString())
        var total = when (currentMode) {
            CalculatorMode.Addition -> num1 + num2
            CalculatorMode.Subtraction -> num1 - num2
            CalculatorMode.Multiply -> num1 * num2
            CalculatorMode.None -> {
                tv_value.text = "No modes Selected"
                return
            }
        }
        tv_value.text = "$total"
    }
}


