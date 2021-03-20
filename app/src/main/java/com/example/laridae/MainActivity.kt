package com.example.laridae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.Gravity
import android.widget.Toast
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.input_username)
        loginButton = findViewById(R.id.login_button)

        loginButton.setOnClickListener { login() }
    }

    private fun login(){
        val bonobo = username.text.toString()
        Toast.makeText(baseContext, bonobo, Toast.LENGTH_LONG).show()
    }
}