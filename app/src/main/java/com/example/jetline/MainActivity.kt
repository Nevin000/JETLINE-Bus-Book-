package com.example.jetline

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    private lateinit var booknow: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()

        setContentView(R.layout.activity_main)

        booknow = findViewById(R.id.booknow_onboard2)

        val text1 = SpannableString("Book")
        text1.setSpan(ForegroundColorSpan(Color.BLUE), 0, text1.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val text2 = SpannableString("Now")
        text2.setSpan(ForegroundColorSpan(Color.GREEN), 0, text2.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Combine text1 and text2 using SpannableStringBuilder
        val combinedText = SpannableString(TextUtils.concat(text1, " ", text2))

        booknow.text = combinedText

        // Inside onCreate() method of your activity
        button = findViewById<Button>(R.id.button) // Replace R.id.button with the ID of your button
        button.setOnClickListener {
            val intent = Intent(this, Onboard2()::class.java)
            startActivity(intent)
            finish()
        }
    }
}