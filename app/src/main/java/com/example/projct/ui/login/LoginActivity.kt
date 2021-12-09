package com.example.projct.ui.login

import android.content.Intent
import android.os.Bundle

import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import com.example.projct.CreateAccount


import com.example.projct.R



class LoginActivity : AppCompatActivity() {

    private lateinit var signup:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signup=findViewById(R.id.submit_btn)
        signup.setOnClickListener {
         val s= Intent(this,CreateAccount::class.java)
            startActivity(s)
        }

    }
}







