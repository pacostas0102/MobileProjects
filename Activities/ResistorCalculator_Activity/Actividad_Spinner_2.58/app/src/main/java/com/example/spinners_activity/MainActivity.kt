package com.example.spinners_activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import org.w3c.dom.Text
import java.text.FieldPosition
import kotlin.math.min

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val check1:CheckBox = findViewById(R.id.check1)
        val check2:CheckBox = findViewById(R.id.check2)
        val calcular = findViewById<Button>(R.id.calcular)
        val myOtraClase= application as GlobalFunctions

        val banda1 = findViewById<ImageView>(R.id.banda1)
        val banda2 = findViewById<ImageView>(R.id.banda2)
        val banda3 = findViewById<ImageView>(R.id.banda3)
        val multi = findViewById<ImageView>(R.id.multiplicador)
        val toler = findViewById<ImageView>(R.id.tolerancia)

        val nominalValue = findViewById<TextView>(R.id.nominal)
        val topValue = findViewById<TextView>(R.id.top_value)
        val minimumValue = findViewById<TextView>(R.id.minimum_value)

        val sp1:Spinner = findViewById(R.id.sp1)
        val bands = resources.getStringArray(R.array.colors)
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, bands)
        sp1.adapter = adaptador

        val sp2:Spinner = findViewById(R.id.sp2)
        val bands2 = resources.getStringArray(R.array.colors)
        val adaptador2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, bands2)
        sp2.adapter = adaptador2

        val sp3:Spinner = findViewById(R.id.sp3)
        val bands3 = resources.getStringArray(R.array.colors)
        val adaptador3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, bands3)
        sp3.adapter = adaptador3

        val sp4_4:Spinner = findViewById(R.id.sp4_4)
        val multiplicador4 = resources.getStringArray(R.array.multiplicador4)
        val adaptador4 = ArrayAdapter(this, android.R.layout.simple_spinner_item, multiplicador4)
        sp4_4.adapter = adaptador4

        val sp4_5:Spinner = findViewById(R.id.sp4_5)
        val tolerancia4 = resources.getStringArray(R.array.tolerancia4)
        val adaptador4_5 = ArrayAdapter(this, android.R.layout.simple_spinner_item, tolerancia4)
        sp4_5.adapter = adaptador4_5

        val sp5_4:Spinner = findViewById(R.id.sp5_4)
        val multiplicador5 = resources.getStringArray(R.array.multiplicador5)
        val adaptador5_4 = ArrayAdapter(this, android.R.layout.simple_spinner_item, multiplicador5)
        sp5_4.adapter = adaptador5_4

        val sp5_5:Spinner = findViewById(R.id.sp5_5)
        val tolerancia5 = resources.getStringArray(R.array.tolerancia5)
        val adaptador5 = ArrayAdapter(this, android.R.layout.simple_spinner_item, tolerancia5)
        sp5_5.adapter = adaptador5

        myOtraClase.BackgroundColorsetDefault(banda1, banda2, banda3, multi, toler, sp1, sp2, sp3,sp4_4, sp4_5 ,sp5_4, sp5_5)

         check1.setOnClickListener {
            if(check1.isChecked){

                myOtraClase.BackgroundColorsetDefault(banda1, banda2, banda3, multi, toler, sp1, sp2, sp3,sp4_4, sp4_5 ,sp5_4, sp5_5)
                check2.setChecked(false)
                sp3.setEnabled(false)
                sp1.setEnabled(true)
                sp2.setEnabled(true)
                sp4_4.setVisibility(View.VISIBLE)
                sp4_5.setVisibility(View.VISIBLE)
                sp4_4.setEnabled(true)
                sp4_5.setEnabled(true)
                sp5_4.setVisibility(View.GONE)
                sp5_5.setVisibility(View.GONE)

                bandas4(sp1, sp2, sp4_4, sp4_5, myOtraClase, banda1, banda2, multi, toler, calcular, nominalValue, topValue, minimumValue)
            }else{
                myOtraClase.BackgroundColorsetDefault(banda1, banda2, banda3, multi, toler, sp1, sp2, sp3,sp4_4, sp4_5 ,sp5_4, sp5_5)
            }
        }
        check2.setOnClickListener {
            if(check2.isChecked){
                myOtraClase.BackgroundColorsetDefault(banda1, banda2, banda3, multi, toler, sp1, sp2, sp3,sp4_4, sp4_5 ,sp5_4, sp5_5)
                check1.setChecked(false)
                sp1.setEnabled(true)
                sp2.setEnabled(true)
                sp3.setEnabled(true)
                sp5_4.setVisibility(View.VISIBLE)
                sp5_5.setVisibility(View.VISIBLE)
                sp5_4.setEnabled(true)
                sp5_5.setEnabled(true)
                sp4_4.setVisibility(View.GONE)
                sp4_5.setVisibility(View.GONE)

                bandas5(sp1, sp2, sp3, sp5_4, sp5_5, myOtraClase, banda1, banda2, banda3, multi, toler, calcular, nominalValue, topValue, minimumValue)
            }else{
                myOtraClase.BackgroundColorsetDefault(banda1, banda2, banda3, multi, toler, sp1, sp2, sp3,sp4_4, sp4_5 ,sp5_4, sp5_5)
            }
        }

        calcular.setOnClickListener {
            if (!check1.isChecked || !check2.isChecked ){
                Toast.makeText(this@MainActivity, "porfavor seleccione la cantidad de bandas que desea calcular para la resistencia", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun bandas4(sp1: Spinner, sp2: Spinner, sp4_4: Spinner, sp4_5: Spinner, myOtraClase: GlobalFunctions, banda1: ImageView, banda2: ImageView, multi: ImageView, toler: ImageView, calcular: Button, nominalValue: TextView, topValue: TextView, minimumValue: TextView) {
        sp1.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, bands[p2], Toast.LENGTH_SHORT).show()
                //var colorbanda1 = "R.color.${bands[p2]}"
                //Toast.makeText(this@MainActivity, colorbanda1, Toast.LENGTH_SHORT).show()
                var pos = sp1.selectedItemPosition
                myOtraClase.BackgroundColorsetBandas(banda1, pos)
                myOtraClase.varbanda1 = pos
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "please select a color", Toast.LENGTH_SHORT).show()
            }
        }

        sp2.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, bands2[p2], Toast.LENGTH_SHORT).show()
                var pos2 = sp2.selectedItemPosition
                myOtraClase.BackgroundColorsetBandas(banda2, pos2)
                myOtraClase.varbanda2 = pos2
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "please select a color", Toast.LENGTH_SHORT).show()
            }
        }

        sp4_4.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, multiplicador[p2], Toast.LENGTH_SHORT).show()

                var pos4 = sp4_4.selectedItemPosition
                myOtraClase.BackgroundColorsetMultiplicado4(multi, pos4)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                multi.setBackgroundColor(Color.TRANSPARENT)
                Toast.makeText(this@MainActivity, "please select a color", Toast.LENGTH_SHORT).show()
            }
        }
        sp4_5.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, tolerancia[p2], Toast.LENGTH_SHORT).show()

                var pos5 = sp4_5.selectedItemPosition
                myOtraClase.BackgroundColorsetTolerancia4(toler, pos5)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                toler.setBackgroundColor(Color.TRANSPARENT)
                Toast.makeText(this@MainActivity, "please select a color", Toast.LENGTH_SHORT).show()
            }
        }
        calcular.setOnClickListener {

            if ((myOtraClase.multiplicador == 0) && (myOtraClase.tolerancia == 0.0)){
                Toast.makeText(this@MainActivity, "por favor seleccione un color para el multiplicador y la tolerancia", Toast.LENGTH_SHORT).show()
            }else {
                val concatenar = "${myOtraClase.varbanda1}${myOtraClase.varbanda2}".toInt()
                val multiplicadorBanda = concatenar * myOtraClase.multiplicador
                val toleranciaBanda = multiplicadorBanda * myOtraClase.tolerancia
                val minValue = multiplicadorBanda - toleranciaBanda
                val maxValue = multiplicadorBanda + toleranciaBanda
                nominalValue.setText("${multiplicadorBanda} Ohmios")
                topValue.setText("${maxValue} Ohmios")
                minimumValue.setText("${minValue} Ohmios")
            }
        }
    }

    private fun bandas5( sp1: Spinner, sp2: Spinner, sp3: Spinner, sp5_4: Spinner, sp5_5: Spinner, myOtraClase: GlobalFunctions,
        banda1: ImageView, banda2: ImageView, banda3: ImageView, multi: ImageView, toler: ImageView, calcular: Button, nominalValue: TextView, topValue: TextView, minimumValue: TextView) {
        sp1.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, bands[p2], Toast.LENGTH_SHORT).show()
                //var colorbanda1 = "R.color.${bands[p2]}"
                //Toast.makeText(this@MainActivity, colorbanda1, Toast.LENGTH_SHORT).show()
                var pos = sp1.selectedItemPosition
                myOtraClase.BackgroundColorsetBandas(banda1, pos)
                myOtraClase.varbanda1 = pos
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        sp2.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, bands2[p2], Toast.LENGTH_SHORT).show()
                var pos2 = sp2.selectedItemPosition
                myOtraClase.BackgroundColorsetBandas(banda2, pos2)
                myOtraClase.varbanda2 = pos2
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        sp3.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, bands3[p2], Toast.LENGTH_SHORT).show()
                var pos3 = sp3.selectedItemPosition
                myOtraClase.BackgroundColorsetBandas(banda3, pos3)
                myOtraClase.varbanda3 = pos3
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        sp5_4.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, multiplicador[p2], Toast.LENGTH_SHORT).show()
                var pos4 = sp5_4.selectedItemPosition
                myOtraClase.BackgroundColorsetMultiplicado5(multi, pos4)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        sp5_5.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //Toast.makeText(this@MainActivity, tolerancia[p2], Toast.LENGTH_SHORT).show()

                var pos5 = sp5_5.selectedItemPosition
                myOtraClase.BackgroundColorsetTolerancia5(toler, pos5)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        calcular.setOnClickListener {
            if ((myOtraClase.multiplicador == 0) && (myOtraClase.tolerancia == 0.0)){
                Toast.makeText(this@MainActivity, "por favor seleccione un color para el multiplicador y la tolerancia", Toast.LENGTH_SHORT).show()
            }else {
            val concatenar = "${myOtraClase.varbanda1}${myOtraClase.varbanda2}${myOtraClase.varbanda3}".toInt()
            val multiplicadorBanda = concatenar * myOtraClase.multiplicador
            val toleranciaBanda = multiplicadorBanda * myOtraClase.tolerancia
            val minValue = multiplicadorBanda - toleranciaBanda
            val maxValue = multiplicadorBanda + toleranciaBanda
            nominalValue.setText("${multiplicadorBanda} Ohmios")
            topValue.setText("${maxValue} Ohmios")
            minimumValue.setText("${minValue} Ohmios")}

        }
    }
}