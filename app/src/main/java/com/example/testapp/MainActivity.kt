package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // You can change variable values
        var name = "Xyz"
        name = "Some one else"
        var age = 27
        Toast.makeText(this, "My name is $name and age is $age", Toast.LENGTH_SHORT).show()

    }

}