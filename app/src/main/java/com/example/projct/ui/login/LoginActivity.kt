package com.example.projct.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import com.example.projct.CreateAccount


import com.example.projct.R
import java.time.Instant

class LoginActivity : AppCompatActivity() {

    //private lateinit var signup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
       var signup:Button=findViewById(R.id.submit_btn)
        signup.setOnClickListener ({
         var s= Intent(this,CreateAccount::class.java)
            startActivity(s)
        })

    }
}







