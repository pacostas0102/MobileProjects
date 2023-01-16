package com.example.class0919_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spn1:Spinner=findViewById(R.id.sp1)
        //val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thrusday", "Friday")
        val week = resources.getStringArray(R.array.days)
        //val adaptador =ArrayAdapter(this, android.R.layout.simple_spinner_item, days)
        val adaptador =ArrayAdapter(this, android.R.layout.simple_spinner_item, week)
        spn1.adapter = adaptador

        spn1.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@MainActivity, week[p2], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            }
    }
}