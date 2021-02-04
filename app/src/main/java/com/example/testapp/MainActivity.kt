package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Methods with parameters pass integer values
        addNumbers(15, 20)
        displayName("Xyz")

    }

    fun addNumbers(num1: Int, num2: Int) {
        var sum = num1 + num2
        tv_name.text = "The sum of two numbers are $sum"
    }

    fun displayName(s: String) {
        Toast.makeText(this, "My name is $s .", Toast.LENGTH_SHORT).show()
    }


}