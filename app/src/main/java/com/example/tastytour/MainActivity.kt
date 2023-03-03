package com.example.tastytour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import com.example.tastytour.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    // Show the home fragment
                    true
                }
                R.id.navigation_search -> {
                    // Show the search fragment
                    true
                }
                R.id.navigation_saved -> {
                    // Show the saved fragment
                    true
                }
                R.id.navigation_reserve -> {
                    // Show the reserve fragment
                    true
                }
                R.id.navigation_deals -> {
                    // Show the deals fragment
                    true
                }
                else -> false
            }
        }

        // Show the home fragment by default
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, HomeFragment())
            .commit()
    }
}
