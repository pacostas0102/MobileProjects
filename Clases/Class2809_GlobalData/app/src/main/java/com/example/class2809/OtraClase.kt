package com.example.class2809

import android.app.Application

class OtraClase: Application() {
    var money:Int=0

    override fun onCreate() {
        super.onCreate()
        val pref = getSharedPreferences("pref", MODE_PRIVATE)
        money = pref.getInt("saldo_inicial", 5)
    }
    fun addMoney(){
        money+=1
    }
}