package com.example.class21092022

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Deposit: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deposit)

        val myOtraClase= application as GlobalData

        val btnDeposit = findViewById<Button>(R.id.btnDeposit)
        val Username1 = findViewById<TextView>(R.id.Username1)
        var increment = findViewById<EditText>(R.id.ET2)
        val btnIncrement = findViewById<Button>(R.id.btnIncrement)
        val btnDecrease = findViewById<Button>(R.id.btnDecrease)

        Username1.setText(myOtraClase.username)

        btnDeposit.setOnClickListener{
            if (increment.text.toString() == ""){
                Toast.makeText(this,"Please enter the correct amount to increment", Toast.LENGTH_SHORT).show()
            }else {
                myOtraClase.addMoney(increment.text.toString().toInt())
                startActivity(Intent(this, MoneyActivity::class.java))
            }
        }

        btnDecrease.setOnClickListener {

            if  (increment.text.toString() == ""){
                Toast.makeText(this,"Please enter the amount to increment", Toast.LENGTH_SHORT).show()
            } else if (increment.text.toString().toInt() <= 0){
                Toast.makeText(this,"Please enter the amount to increment", Toast.LENGTH_SHORT).show()
            }else {
                myOtraClase.addMoneym1000(increment.text.toString().toInt(), 1000)
                increment.setText(myOtraClase.decrease.toString())
            }
        }

        btnIncrement.setOnClickListener {
            if (increment.text.toString() == ""){
                increment.setText("1000")
            }else {
                myOtraClase.addMoney1000(increment.text.toString().toInt(), 1000)
                increment.setText(myOtraClase.increment.toString())
            }
        }

    }
}