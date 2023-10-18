package com.example.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {
    private  lateinit var  edtEmail: EditText
    private  lateinit var  edtpassword: EditText
    private lateinit var  btnlogin: Button
    private  lateinit var  btnsignup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail = findViewById(R.id.edit_email)
        edtpassword = findViewById(R.id.edit_password)
        btnsignup = findViewById(R.id.btn_signup)
        btnlogin =findViewById(R.id.edit_login)








    }
}