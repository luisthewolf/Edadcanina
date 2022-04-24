package com.dam.edadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEdit = findViewById<EditText>(R.id.age_edit)
        val resultText = findViewById<TextView>(R.id.result_text)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val ageString = ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                resultText.text = getString(R.string.result_text, result)
            } else {
                Log.d("MainActivity", "Age String Is Empty")
                Toast.makeText(this, R.string.you_must_insert_you_age, Toast.LENGTH_SHORT).show()
            }
        }
    }
}