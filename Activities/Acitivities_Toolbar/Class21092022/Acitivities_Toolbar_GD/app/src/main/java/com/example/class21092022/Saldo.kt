package com.example.class21092022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Saldo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saldo)
        val myOtraClase= application as GlobalData
        val tvsaldo = findViewById<TextView>(R.id.tvSaldo)
        val Username = findViewById<TextView>(R.id.Username)
        tvsaldo.setText(myOtraClase.money.toString())
        Username.setText(myOtraClase.username)

    }
}