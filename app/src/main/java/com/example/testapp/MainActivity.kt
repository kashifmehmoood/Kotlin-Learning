package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Simple methods without parametersg
        addNumbers()

    }

    fun addNumbers() {
        var num1 = 12
        var num2 = 15
        var sum = num1 + num2
        tv_name.text = "The sum of two numbers are $sum"
    }


}