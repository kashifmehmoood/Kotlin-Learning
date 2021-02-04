package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Conditional Statements
        btn_compare.setOnClickListener {
            if (ed_firstvalue.text.toString().isEmpty()) {
                ed_firstvalue.setError("Enter First Value..!")
            } else if (ed_secondvalue.text.toString().isEmpty()) {
                ed_secondvalue.setError("Enter Second Value..!")
            } else {
                compareValue(
                    Integer.parseInt(ed_firstvalue.text.toString()),
                    Integer.parseInt(ed_secondvalue.text.toString())
                )
            }
        }
    }

    private fun compareValue(num1: Int, num2: Int) {
        if (num1 > num2)
            tv_value.text = "$num1 is greater than $num2"
        else
            tv_value.text = "$num2 is greater than $num1"
    }

}