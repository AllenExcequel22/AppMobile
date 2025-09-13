package com.example.wherehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val recoverPasswordButton = findViewById<Button>(R.id.recoverPasswordButton)
        val backToLoginButton = findViewById<Button>(R.id.backToLoginButton)

        recoverPasswordButton.setOnClickListener {
            val email = emailEditText.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "Por favor, ingrese su correo electrónico", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Se ha enviado un correo para recuperar su contraseña", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        backToLoginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}