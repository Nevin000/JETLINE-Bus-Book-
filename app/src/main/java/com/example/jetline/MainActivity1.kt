package com.example.jetline

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity1 : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView2)

        bottomNavigationView.setOnItemReselectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home -> {
                    replaceFragment(Home())
                    true
                }
                R.id.booking -> {
                    replaceFragment(Booking())
                    true
                }
                R.id.history -> {
                    replaceFragment(History())
                    true
                }
                R.id.profile -> {
                    replaceFragment(Profile())
                    true
                }
                else -> false
            }
        }
        replaceFragment(Home())

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout,fragment).commit()
    }
}
