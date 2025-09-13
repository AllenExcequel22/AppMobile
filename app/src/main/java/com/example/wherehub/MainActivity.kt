package com.example.wherehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val createAccountTextView = findViewById<TextView>(R.id.createAccountTextView)
        val forgotPasswordTextView = findViewById<TextView>(R.id.forgotPasswordTextView)

        loginButton.setOnClickListener {
            // Lógica para validar el inicio de sesión
        }

        createAccountTextView.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

        forgotPasswordTextView.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}