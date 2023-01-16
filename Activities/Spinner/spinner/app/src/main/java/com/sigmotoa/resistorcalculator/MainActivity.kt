package com.sigmotoa.resistorcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spn1: Spinner = findViewById(R.id.spinner_1)
        val spn2: Spinner = findViewById(R.id.spinner_2)
        val spn3: Spinner = findViewById(R.id.spinner_3)
        val spn4: Spinner = findViewById(R.id.spinner_4)

        val banda1: TextView = findViewById(R.id.banda1)
        val banda2: TextView = findViewById(R.id.banda2)
        val banda3: TextView = findViewById(R.id.banda3)
        val banda4: TextView = findViewById(R.id.banda4)
        val resultado: TextView = findViewById(R.id.tvResultado)
        val tvTolerancia: TextView = findViewById(R.id.tvTolerancia)

        val values = resources.getStringArray(R.array.values)
        val values2 = resources.getStringArray(R.array.values2)
        val values3 = resources.getStringArray(R.array.values3)

        val adaptador1 =ArrayAdapter(this, android.R.layout.simple_spinner_item, values)
        val adaptador2 =ArrayAdapter(this, android.R.layout.simple_spinner_item, values2)
        val adaptador3 =ArrayAdapter(this, android.R.layout.simple_spinner_item, values3)
        spn1.adapter = adaptador1
        spn2.adapter = adaptador1
        spn3.adapter = adaptador2
        spn4.adapter = adaptador3

        var Banda1: String = "0"
        var Banda2: String = "0"
        var Banda3: Long = 0
        var tolerancia: Double = 0.2
        var ohm: Long

        spn1.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            @SuppressLint("ResourceAsColor")

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if ( p2 == 0){
                    Banda1 = (p2).toString()
                }
                else{
                    Banda1 = (p2-1).toString()
                }

                when (p2-1){
                    0 -> banda1.setBackgroundResource(R.color.banda0)
                    1 -> banda1.setBackgroundResource(R.color.banda1)
                    2 -> banda1.setBackgroundResource(R.color.banda2)
                    3 -> banda1.setBackgroundResource(R.color.banda3)
                    4 -> banda1.setBackgroundResource(R.color.banda4)
                    5 -> banda1.setBackgroundResource(R.color.banda5)
                    6 -> banda1.setBackgroundResource(R.color.banda6)
                    7 -> banda1.setBackgroundResource(R.color.banda7)
                    8 -> banda1.setBackgroundResource(R.color.banda8)
                    9 -> banda1.setBackgroundResource(R.color.banda9)
                    else -> banda1.setBackgroundResource(R.color.banda0)
                }
                ohm = (Banda1+Banda2).toLong() * Banda3
                resultado.setText(ohm.toString() + "Ώ")
                tvTolerancia.setText((tolerancia*100).toString() + "% de tolerancia")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        spn2.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if ( p2 == 0){
                    Banda2 = (p2).toString()
                }
                else{
                    Banda2 = (p2-1).toString()
                }
                when (p2-1){
                    0 -> banda2.setBackgroundResource(R.color.banda0)
                    1 -> banda2.setBackgroundResource(R.color.banda1)
                    2 -> banda2.setBackgroundResource(R.color.banda2)
                    3 -> banda2.setBackgroundResource(R.color.banda3)
                    4 -> banda2.setBackgroundResource(R.color.banda4)
                    5 -> banda2.setBackgroundResource(R.color.banda5)
                    6 -> banda2.setBackgroundResource(R.color.banda6)
                    7 -> banda2.setBackgroundResource(R.color.banda7)
                    8 -> banda2.setBackgroundResource(R.color.banda8)
                    9 -> banda2.setBackgroundResource(R.color.banda9)
                    else -> banda2.setBackgroundResource(R.color.banda0)
                }
                ohm = (Banda1+Banda2).toLong() * Banda3
                resultado.setText(ohm.toString() + "Ώ")
                tvTolerancia.setText((tolerancia*100).toString() + "% de tolerancia")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        spn3.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                when (p2-1){
                    0 -> {
                        banda3.setBackgroundResource(R.color.banda0)
                        Banda3 = 1
                    }
                    1 -> {

                        banda3.setBackgroundResource(R.color.banda1)
                        Banda3 = 10
                    }
                    2 -> {
                        banda3.setBackgroundResource(R.color.banda2)
                        Banda3 = 100
                    }
                    3 -> {
                        banda3.setBackgroundResource(R.color.banda3)
                        Banda3 = 1000
                    }
                    4 -> {
                        banda3.setBackgroundResource(R.color.banda4)
                        Banda3 = 10000
                    }
                    5 -> {
                        banda3.setBackgroundResource(R.color.banda5)
                        Banda3 = 100000
                    }
                    6 -> {
                        banda3.setBackgroundResource(R.color.banda6)
                        Banda3 = 1000000
                    }
                    7 -> {
                        banda3.setBackgroundResource(R.color.banda7)
                        Banda3 = 10000000
                    }
                    8 -> {
                        banda3.setBackgroundResource(R.color.banda8)
                        Banda3 = 100000000
                    }
                    9 -> {
                        banda3.setBackgroundResource(R.color.banda9)
                        Banda3 = 1000000000
                    }
                    10 -> {
                        banda3.setBackgroundResource(R.drawable.background_dorado)
                        Banda3 = 10000000000
                    }
                    11 -> {
                        banda3.setBackgroundResource(R.drawable.background_plateado)
                        Banda3 = 100000000000
                    }
                    else -> {
                        banda3.setBackgroundResource(R.color.banda0)
                        Banda3 = 1
                    }
                }
                ohm = (Banda1+Banda2).toLong() * Banda3
                resultado.setText(ohm.toString() + "Ώ")
                tvTolerancia.setText((tolerancia*100).toString() + "% de tolerancia")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        spn4.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (p2-1){
                    0 -> {
                        banda4.setBackgroundResource(R.color.banda1)
                        tolerancia = 0.01
                    }
                    1 -> {
                        banda4.setBackgroundResource(R.color.banda2)
                        tolerancia = 0.02
                    }
                    2 -> {
                        banda4.setBackgroundResource(R.drawable.background_dorado)
                        tolerancia = 0.05
                    }
                    3 -> {
                        banda4.setBackgroundResource(R.drawable.background_plateado)
                        tolerancia = 0.10
                    }
                    else -> {
                        banda4.setBackgroundResource(R.color.banda0)
                        tolerancia = 0.20
                    }

                }
                ohm = (Banda1+Banda2).toLong() * Banda3
                resultado.setText(ohm.toString() + "Ώ")
                tvTolerancia.setText((tolerancia*100).toString() + "% de tolerancia")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}