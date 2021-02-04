package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Using For Loops
        val buttons = arrayOf(btn_one, btn_two, btn_three)
        for(i in buttons.indices)
        {
            buttons[i].setOnClickListener {
                pressedButton(i+1)
            }
        }
    }

    private fun pressedButton(i: Int) {
        tv_value.text = "" + i
    }

}