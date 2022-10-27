package com.example.class21092022

import android.app.Application
import android.widget.EditText
import android.widget.Toast

class GlobalData:  Application()  {
    var money:Int=0
    var username: String = ""
    var increment: Int=0
    var decrease: Int=0

    override fun onCreate() {
        super.onCreate()
        val pref = getSharedPreferences("pref", MODE_PRIVATE)
        money = pref.getInt("saldo_inicial", 1000)

    }
    fun addMoney(j: Int){
        money+= j
    }
    fun addMoney1000(i: Int, a: Int){
        increment = i + a
    }
    fun addMoneym1000(i: Int, a: Int){
         decrease = i - a
    }
    fun decreaseMoney(j: Int){
        money-= j
    }
    fun addUser(u: String){
        username = u
        Toast.makeText(this, "Welcome $username", Toast.LENGTH_SHORT).show()
    }
}