package com.example.activityselectors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*

var rb1: RadioButton?=null
var rb2: RadioButton?=null
var rb3: RadioButton?=null
var rb4: RadioButton?=null
var rb5: RadioButton?=null
var rg: RadioGroup?=null

class MainActivity : AppCompatActivity() , RadioGroup.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg = findViewById(R.id.rg2)
        rb1 = findViewById(R.id.rb1)
        rb2 = findViewById(R.id.rb2)
        rb3 = findViewById(R.id.rb3)
        rb4 = findViewById(R.id.rb4)
        rb5 = findViewById(R.id.rb5)

        rg?.setOnCheckedChangeListener(this)

        val btn7: Button=findViewById(R.id.button7)
        val btn1: Button=findViewById(R.id.button)
        val btn2: Button=findViewById(R.id.button2)
        val btn3: Button=findViewById(R.id.button3)
        val btn4: Button=findViewById(R.id.button4)
        val btn5: Button=findViewById(R.id.button5)
        val btn6: Button=findViewById(R.id.button6)

        btn1.setOnClickListener{
            if(btn1.isPressed){
                msg("Button1")
            }
        }
        btn2.setOnClickListener{
            if(btn2.isPressed){
                msg("Button2")
            }
        }
        btn3.setOnClickListener{
            if(btn3.isPressed){
                msg("Button3")
            }
        }
        btn4.setOnClickListener{
            if(btn4.isPressed){
                msg("Button4")
            }
        }
        btn5.setOnClickListener{
            if(btn5.isPressed){
                msg("Button5")
            }
        }
        btn6.setOnClickListener{
            if(btn6.isPressed){
                msg("Button6")
            }
        }
        btn7.setOnClickListener{
            if(btn7.isPressed){
                msg("Button7")
            }
        }

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

        val rtb: RatingBar =findViewById(R.id.ratingBar)
        rtb.setOnRatingBarChangeListener { ratingBar, fl, b -> msg("Calification $fl")  }

    }
    fun msg (number: String){
        val tv: TextView = findViewById(R.id.txtView1)
        tv.setText("Cambio al pulsar $number")
        var msg= Toast.makeText(this, "Radio $number", Toast.LENGTH_SHORT)
        msg.setGravity(Gravity.TOP,0,0)
        msg.show()
    }

    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
        when(p1){
            rb1?.id->msg("1")
            rb2?.id->msg("2")
            rb3?.id->msg("3")
            rb4?.id->msg("4")
            rb5?.id->msg("5")
        }
    }
}

