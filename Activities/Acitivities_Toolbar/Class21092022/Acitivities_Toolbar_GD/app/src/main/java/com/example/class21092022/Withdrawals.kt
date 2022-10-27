package com.example.class21092022

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Withdrawals: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdrawals)
        val myOtraClase = application as GlobalData

        val btnWithdrawal = findViewById<Button>(R.id.btnWithdraw)
        val Username2 = findViewById<TextView>(R.id.Username2)
        var decreasement = findViewById<EditText>(R.id.ET3)
        val btnIncrementW = findViewById<Button>(R.id.btnIncrementW)
        val btnDecreaseW = findViewById<Button>(R.id.btnDecreaseW)
        var valida = 0

        Username2.setText(myOtraClase.username)

        btnWithdrawal.setOnClickListener{
            valida = myOtraClase.money - decreasement.text.toString().toInt()

            if (decreasement.text.toString() == ""){
                Toast.makeText(this,"Please enter the correct amount to withdraw", Toast.LENGTH_SHORT).show()
            }else if (valida <= 0){
                Toast.makeText(this,"Insufficient Funds, please check your balance", Toast.LENGTH_SHORT).show()
            }else {
                myOtraClase.decreaseMoney(decreasement.text.toString().toInt())
                startActivity(Intent(this, MoneyActivity::class.java))
            }
        }

        btnDecreaseW.setOnClickListener {

            if  (decreasement.text.toString() == ""){
                Toast.makeText(this,"Please enter the amount to withdraw", Toast.LENGTH_SHORT).show()
            } else if (decreasement.text.toString().toInt() <= 0){
                Toast.makeText(this,"Please enter the amount to withdraw", Toast.LENGTH_SHORT).show()
            }else {
                myOtraClase.addMoneym1000(decreasement.text.toString().toInt(), 1000)
                decreasement.setText(myOtraClase.decrease.toString())
            }
        }

        btnIncrementW.setOnClickListener {
            if (decreasement.text.toString() == ""){
                decreasement.setText("1000")
            }else {
                myOtraClase.addMoney1000(decreasement.text.toString().toInt(), 1000)
                decreasement.setText(myOtraClase.increment.toString())
            }
        }



    }
}