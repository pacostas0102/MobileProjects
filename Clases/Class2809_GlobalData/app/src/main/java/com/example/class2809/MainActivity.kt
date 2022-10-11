package com.example.class2809

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myOtraClase= application as OtraClase

        val tvmoney = findViewById<TextView>(R.id.tvmoney)
        val btnadd = findViewById<Button>(R.id.btnIncrementar)
        val btnshow = findViewById<Button>(R.id.btnSaldo)

        btnadd.setOnClickListener{
            myOtraClase.addMoney()
            tvmoney.setText(myOtraClase.money.toString())
        }
       // myOtraClase.addMoney()

        tvmoney.setText(myOtraClase.money.toString())

        btnshow.setOnClickListener {
            startActivity(Intent(this, Saldo::class.java))
        }
    }
}