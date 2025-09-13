package com.example.wherehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val fullNameEditText = findViewById<EditText>(R.id.fullNameEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val addressEditText = findViewById<EditText>(R.id.addressEditText)
        val createAccountButton = findViewById<Button>(R.id.createAccountButton)
        val backToLoginButton = findViewById<Button>(R.id.backToLoginButton)

        createAccountButton.setOnClickListener {
            val fullName = fullNameEditText.text.toString()
            val email = emailEditText.text.toString()
            val phone = phoneEditText.text.toString()
            val address = addressEditText.text.toString()

            if (fullName.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()) {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Cuenta creada exitosamente", Toast.LENGTH_SHORT).show()
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