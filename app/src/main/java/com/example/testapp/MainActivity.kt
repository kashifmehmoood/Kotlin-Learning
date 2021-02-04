package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Using Arrays
        val buttons = arrayOf(btn_one, btn_two, btn_three)
        buttons[0].setOnClickListener {
            pressedButton(1)
        }
        buttons[1].setOnClickListener {
            pressedButton(2)
        }
        buttons[2].setOnClickListener {
            pressedButton(3)
        }
    }

    private fun pressedButton(i: Int) {
        tv_value.text = "" + i
    }

}