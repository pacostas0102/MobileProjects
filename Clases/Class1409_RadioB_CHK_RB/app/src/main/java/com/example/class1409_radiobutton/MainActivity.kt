package com.example.class1409_radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*

var rb1:RadioButton?=null
var rb2:RadioButton?=null
var rb3:RadioButton?=null
var rb4:RadioButton?=null
var rg:RadioGroup?=null

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg = findViewById(R.id.rg)
        rb1 = findViewById(R.id.rb1)
        rb2 = findViewById(R.id.rb2)
        rb3 = findViewById(R.id.rb3)
        rb4 = findViewById(R.id.rb4)

        rg?.setOnCheckedChangeListener(this)

        val box1:CheckBox = findViewById(R.id.chk1)
        val box2:CheckBox = findViewById(R.id.chk2)

        box1.setOnClickListener{
            if(box1.isChecked){
                msg("CheckBox1")
            }
        }
        box2.setOnClickListener{
            if(box2.isChecked){
                msg("CheckBox2")
            }
        }

        val rtb:RatingBar=findViewById(R.id.ratingBar)
        rtb.setOnRatingBarChangeListener { ratingBar, fl, b -> msg("Calification $fl")  }

    }

    fun msg (number: String){
        val tv:TextView = findViewById(R.id.txtView1)
        tv.setText("Cambio al pulsar $number")
        var msg=Toast.makeText(this, "Radio $number", Toast.LENGTH_SHORT)
            msg.setGravity(Gravity.TOP,0,0)
            msg.show()
    }
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            val checked = view.isChecked
            when(view.id){
                R.id.rb5-> if (checked)
                {msg("Group 2 radio 1")}
                R.id.rb6-> if (checked)
                {msg("Group 2 radio 2")}

            }
        }
    }
    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {

        when(p1){
            rb1?.id->msg("1")
            rb2?.id->msg("2")
            rb3?.id->msg("3")
            rb4?.id->msg("4")
        }
    }
}