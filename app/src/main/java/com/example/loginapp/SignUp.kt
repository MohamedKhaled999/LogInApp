package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUp : AppCompatActivity(),View.OnClickListener {
    lateinit var userName  : EditText
    lateinit var password  : EditText
    lateinit var email  : EditText
    lateinit var signUp : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        userName =findViewById(R.id.editTextTextMultiLine)
        password =findViewById(R.id.editTextTextPassword)
        email =findViewById(R.id.editTextTextEmailAddress)
        signUp =findViewById(R.id.button2)

        signUp.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (userName.text.toString().isEmpty()||password.text.toString().isEmpty()||
            email.text.toString().isEmpty()){
            Toast.makeText(this,"Empty field", Toast.LENGTH_LONG).show()
        }
        Toast.makeText(this,"successful entry", Toast.LENGTH_LONG).show()
    }
}