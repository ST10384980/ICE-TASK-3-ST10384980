package com.example.st10384980imad5112icetask3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle: Bundle? = intent.extras

        val tableString: String? = bundle?.getString("tableBomb")


        val tableNumber = tableString!!.toInt()

        val multiplicationTable = findViewById<TextView>(R.id.multiplicationTableTextView)




        var tableDisplay: String = "$tableNumber x table\n\n"



        var counter = 1
        while (counter <= 10) {

            if (counter == 3) {
                counter++
                continue
            }
            val answer = tableNumber * counter
            tableDisplay += "$tableNumber x $counter = ${answer}\n"
            counter++

        }
        multiplicationTable.text = tableDisplay
    }
}