package com.example.st10384980imad5112icetask3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val multiplyButton = findViewById<Button>(R.id.multiplyButton)

        val tableNumberEditText = findViewById<EditText>(R.id.tableNumberEditText)

        multiplyButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)





            intent.putExtra("tableBomb", tableNumberEditText.text.toString())

            startActivity(intent)


        }





    }
}