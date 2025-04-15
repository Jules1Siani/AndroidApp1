package com.louiserennick.cointoss2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var heads = 0
    private var tails = 0

    private lateinit var coinImage: ImageView
    private lateinit var headsCount: TextView
    private lateinit var tailsCount: TextView
    private lateinit var tossButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connect UI components
        coinImage = findViewById(R.id.coinImage)
        headsCount = findViewById(R.id.headsCount)
        tailsCount = findViewById(R.id.tailsCount)
        tossButton = findViewById(R.id.tossButton)

        // Toss button logic
        tossButton.setOnClickListener {
            tossCoin()
        }

        // Sign Up button logic
        val signUpButton = findViewById<Button>(R.id.sign_up)
        signUpButton.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }

    private fun tossCoin() {
        val result = Random.nextBoolean() // true = heads and false = tails

        if (result) {
            heads++
            coinImage.setImageResource(R.drawable.jules_heads)
        } else {
            tails++
            coinImage.setImageResource(R.drawable.jules_tails)
        }

        // Update the counters using getString + placeholders
        headsCount.text = getString(R.string.heads_count, heads)
        tailsCount.text = getString(R.string.tails_count, tails)
    }
}
