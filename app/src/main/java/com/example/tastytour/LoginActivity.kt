package com.example.tastytour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import com.example.tastytour.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding.loginButton.setOnClickListener {
            if (binding.emailLogin.text.isNullOrBlank() && binding.passwordLogin.text.isNullOrBlank()) {
                Toast.makeText(this, "Please fill the required details", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"${binding.emailLogin.text} is logged in", Toast.LENGTH_SHORT).show()
            }
            // Move to homepage
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish the current activity to prevent going back to login screen on back press
        }
    }

    private fun isValidCredentials(email: String, password: String): Boolean {
        // TODO: implement credentials check
        return email == "example@gmail.com" && password == "password123"
    }
}


