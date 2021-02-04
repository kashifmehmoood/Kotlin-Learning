package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Connect button to a methods
        btn_add.setOnClickListener {
            if(ed_firstValue.text.toString().isEmpty())
            {
                ed_firstValue.setError("Enter First Value..!")
            }
            else if(ed_secondValue.text.toString().isEmpty())
            {
                ed_secondValue.setError("Enter Second Value..!")
            }
            else
            {
                addNumbers(Integer.parseInt(ed_firstValue.text.toString()), Integer.parseInt(ed_secondValue.text.toString()))
            }

        }

    }

    fun addNumbers(num1: Int, num2: Int) {
        var sum = num1 + num2
        tv_name.text = "The sum of two numbers are $sum"
    }

}