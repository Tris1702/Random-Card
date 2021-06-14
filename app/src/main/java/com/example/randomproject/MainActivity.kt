package com.example.randomproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawButton: Button = findViewById(R.id.draw_button)
        val resultText: TextView = findViewById(R.id.result_text)
        val resultImage:ImageView = findViewById(R.id.image_view)
        resultText.text = "Your card is"
        fun changeCard(){
            val randomCard1 = ('a'..'b').random()
            val randomCard2 = ('a'..'z').random()
            val nameImage = randomCard1.toString() + randomCard2.toString()
            val resId:Int = resources.getIdentifier(
                nameImage, "drawable",
                packageName
            )
            resultImage.setImageResource(resId)
        }
        drawButton.setOnClickListener{
            drawCard()
            changeCard()
        }
    }
    private fun drawCard(){
        Toast.makeText(this, "Drawing card...", Toast.LENGTH_LONG).show()
    }

}