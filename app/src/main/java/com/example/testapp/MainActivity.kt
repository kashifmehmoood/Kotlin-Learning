package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Conditional Statements boolean value
        btn_compare.setOnClickListener {
            if (isOn) {
                isOn = false
                tv_value.text = "On"
            } else {
                isOn = true
                tv_value.text = "Off"
            }

        }
    }

}