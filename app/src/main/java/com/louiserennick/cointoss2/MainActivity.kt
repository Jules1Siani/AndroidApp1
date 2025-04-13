package com.louiserennick.cointoss2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var heads = 0
    private var tails = 0

    private lateinit var  coinImage : ImageView
    private lateinit var  headsCount: TextView
    private lateinit var  tailsCount: TextView
    private lateinit var  tossButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // connect UI components
        coinImage = findViewById(R.id.coinImage)
        headsCount = findViewById(R.id.headsCount)
        tailsCount = findViewById(R.id.tailsCount)
        tossButton = findViewById(R.id.tossButton)

        // Toss button logic
        tossButton.setOnClickListener {
            tossCoin()
        }
        // sign up btn logic
        // add code fun here make the button work



    }
    private fun tossCoin() {
        val result = Random.nextBoolean() // true = heads and false = tails

        if(result) {
            heads++
            coinImage.setImageResource(R.drawable.coin_heads)
        }else{
            tails++
            coinImage.setImageResource(R.drawable.coin_tails)
        }

        // update the counters
        headsCount.text = "Heads: $heads"
        tailsCount.text = "Tails: $tails"
    }
}