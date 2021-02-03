package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
enum class CalculatorModes {
    None, Addition, Subtraction, Division, Multiplication
}
class MainActivity : AppCompatActivity() {
    private val mode = CalculatorModes.Addition
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val mode = CalculatorModes.Addition
        //Below line gives error because val cannot be rassigned but var can be assigned multiple times
      // mode=CalculatorModes.Division
        tv_name.text= "Calculator mode is $mode"


    }


}