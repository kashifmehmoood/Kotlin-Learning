package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Connect button to a methods
        btn_one.setOnClickListener {
            displayText("One")
        }
        btn_two.setOnClickListener {
            displayText("Two")
        }
        btn_three.setOnClickListener {
            displayText("Three")
        }

    }

    fun displayText(s: String) {
        tv_name.text = "You pressed button $s"
    }

}