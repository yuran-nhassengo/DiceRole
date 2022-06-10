package com.lamarck.dicerole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val rollButton: Button = findViewById(R.id.button)
         val resultTextView: TextView = findViewById(R.id.textView)

        rollButton.setOnClickListener {
            resultTextView.text = "6"
        }
    }
}