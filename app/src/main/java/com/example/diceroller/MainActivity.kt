package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to roll button saved to value
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)

        val resultTextView: TextView = findViewById(R.id.rollNumber)
        resultTextView.text = dice.roll().toString()
    }
}

class Dice(private val numOfSides: Int) {

    fun roll(): Int {
        return (1..numOfSides).random()
    }
}
