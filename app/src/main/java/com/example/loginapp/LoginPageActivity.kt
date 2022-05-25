package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginPageActivity : AppCompatActivity() {
    lateinit var btnLogin2:Button
    lateinit var etUsername:EditText
    lateinit var etPassword:EditText
    lateinit var tvSignup1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        btnLogin2 = findViewById(R.id.btnLogin2)
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        tvSignup1 = findViewById(R.id.tvSignup1)

        btnLogin2.setOnClickListener {
            var username = etUsername.text.toString()
            var password = etPassword.text.toString()
            if (username.isBlank()){
                etUsername.error = "Username is required"
                return@setOnClickListener
            }
            if (password.isBlank()){
                etPassword.error = "Password is required"
                return@setOnClickListener
            }
        }
        tvSignup1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}