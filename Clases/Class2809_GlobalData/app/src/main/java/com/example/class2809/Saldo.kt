package com.example.class2809

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Saldo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saldo)
        val myOtraClase= application as OtraClase
        val tvsaldo = findViewById<TextView>(R.id.tvSaldo)
        tvsaldo.setText(myOtraClase.money.toString())
    }
}