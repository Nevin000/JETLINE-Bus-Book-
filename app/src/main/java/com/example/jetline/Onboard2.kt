package com.example.jetline

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Onboard2 : AppCompatActivity() {

    private lateinit var booknow: TextView
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard2) // Set the layout file for Onboard2 activity

        booknow = findViewById(R.id.booknow_Onboard2)

        val text1 = SpannableString("Book")
        text1.setSpan(ForegroundColorSpan(Color.BLUE), 0, text1.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val text2 = SpannableString("Now")
        text2.setSpan(ForegroundColorSpan(Color.GREEN), 0, text2.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Combine text1 and text2 using SpannableStringBuilder
        val combinedText = SpannableString(TextUtils.concat(text1, " ", text2))

        booknow.text = combinedText

        button2 = findViewById<Button>(R.id.button2) // Replace R.id.button with the ID of your button
        button2.setOnClickListener {
            val intent = Intent(this, Onboard3()::class.java)
            startActivity(intent)
            finish()
        }
    }

    // Any additional code for Onboard2 activity can be added here
}

