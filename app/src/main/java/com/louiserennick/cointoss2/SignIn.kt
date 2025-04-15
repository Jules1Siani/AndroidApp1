package com.louiserennick.cointoss2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val loginButton = findViewById<Button>(R.id.btn_login)
        val emailField = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val passwordField = findViewById<EditText>(R.id.editTextTextPassword2)

        loginButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Welcome, $email!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
