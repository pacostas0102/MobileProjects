package com.example.class21092022

import android.content.Intent
import android.os.Bundle
import android.service.autofill.Validators.and
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MoneyActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.money)

        val myOtraClase= application as GlobalData
        val tvmoney = findViewById<TextView>(R.id.tvmoney)
        val btnadd = findViewById<Button>(R.id.btnIncrementar)
        val btnshow = findViewById<Button>(R.id.btnSaldo)
        val btnWithdrawals = findViewById<Button>(R.id.btnWithdrawals)
        val username = findViewById<EditText>(R.id.ET1)
        val btnatras = findViewById<Button>(R.id.btnatras)

        if (myOtraClase.username != ""){
            username.setText(myOtraClase.username)
        }

        tvmoney.text = myOtraClase.money.toString()

        btnshow.setOnClickListener {
            if (username.text.toString() == "") {
                Toast.makeText(this,"Please enter your username", Toast.LENGTH_SHORT).show()
            }else{
                myOtraClase.addUser(username.text.toString())
                startActivity(Intent(this, Saldo::class.java))
            }

        }

        btnatras.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btnWithdrawals.setOnClickListener {
            if (username.text.toString() == "") {
                Toast.makeText(this,"Please enter your username", Toast.LENGTH_SHORT).show()
            }else {
                myOtraClase.addUser(username.text.toString())
                startActivity(Intent(this, Withdrawals::class.java))
            }
        }

        btnadd.setOnClickListener{
            if (username.text.toString() == "") {
                Toast.makeText(this,"Please enter your username", Toast.LENGTH_SHORT).show()
            }else {
                myOtraClase.addUser(username.text.toString())
                startActivity(Intent(this, Deposit::class.java))
            }
        }

    }
}