package com.example.mobileappdevcoursework

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next = findViewById<Button>(R.id.buttonNext)
        next.isEnabled = false
    }

    fun onRadioButtonClicked(view: View) {
        val next = findViewById<Button>(R.id.buttonNext)
        next.isEnabled = true
    }
}