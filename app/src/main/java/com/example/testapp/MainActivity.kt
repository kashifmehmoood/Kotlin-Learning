package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

enum class CalculatorModes {
    None, Addition, Subtraction, Division, Multiplication
}

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mode = CalculatorModes.Addition
        tv_name.text = "Calculator mode is $mode"

    }


}