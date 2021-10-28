package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var userName  :EditText
    lateinit var password  :EditText
    lateinit var signUp :TextView

    lateinit var logIn :Button

    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userName =findViewById(R.id.user_name)
        password =findViewById(R.id.password)
        signUp =findViewById(R.id.textView3)

        logIn =findViewById(R.id.button)
        signUp.setOnClickListener(this)

        logIn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id==logIn.id) {
                if (userName.text.toString().isEmpty() || password.text.toString().isEmpty()) {
                    Toast.makeText(this, "Empty field", Toast.LENGTH_LONG).show()
                } else {

                    Toast.makeText(this, "successful entry", Toast.LENGTH_LONG).show()

                }
            }else{
                var intent = Intent(this, SignUp::class.java)
                startActivity(intent)
            }
        }
    }
}