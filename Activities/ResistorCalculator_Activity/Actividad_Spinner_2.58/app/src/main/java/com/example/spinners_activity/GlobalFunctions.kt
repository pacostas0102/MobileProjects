package com.example.spinners_activity

import android.app.Application
import android.graphics.Color
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast

class GlobalFunctions:  Application()  {
    var varbanda1 : Int = 0
    var varbanda2 : Int = 0
    var varbanda3 : Int = 0
    var multiplicador : Int = 0
    var tolerancia: Double = 0.0

    fun BackgroundColorsetBandas (banda: ImageView, pos: Int){
        when(pos){
            0 -> banda.setBackgroundResource(R.color.Negro)
            1 -> banda.setBackgroundResource(R.color.Marron)
            2 -> banda.setBackgroundResource(R.color.Rojo)
            3 -> banda.setBackgroundResource(R.color.Naranja)
            4 -> banda.setBackgroundResource(R.color.Amarillo)
            5 -> banda.setBackgroundResource(R.color.Verde)
            6 -> banda.setBackgroundResource(R.color.Azul)
            7 -> banda.setBackgroundResource(R.color.Violeta)
            8 -> banda.setBackgroundResource(R.color.Gris)
            9 -> banda.setBackgroundResource(R.color.Blanco)
        }

        //Toast.makeText(this, varbanda1.toString(), Toast.LENGTH_SHORT).show()
    }
    fun BackgroundColorsetTolerancia4 (banda: ImageView, pos: Int){
        when(pos){
            0 -> {
                banda.setBackgroundResource(R.color.Marron)
                tolerancia = 1.0/100
            }
            1 -> {
                banda.setBackgroundResource(R.color.Rojo)
                tolerancia = 2.0/100
            }
            2 ->{
                banda.setBackgroundResource(R.color.Dorado)
                tolerancia = 5.0/100
            }
            3 -> {
                banda.setBackgroundResource(R.color.Plateado)
                tolerancia = 10.0/100
            }
            4 -> {
                banda.setBackgroundColor(Color.TRANSPARENT)
                tolerancia = 20.0/100
            }
        }
    }
    fun BackgroundColorsetTolerancia5 (banda: ImageView, pos: Int){
        when(pos){
            0 -> {
                banda.setBackgroundResource(R.color.Marron)
                tolerancia = 1.0/100
            }
            1 -> {
                banda.setBackgroundResource(R.color.Rojo)
                tolerancia = 2.0/100
            }
            2 -> {
                banda.setBackgroundResource(R.color.Verde)
                tolerancia = 0.5/100
            }
            3 -> {
                banda.setBackgroundResource(R.color.Azul)
                tolerancia = 0.25/100
            }
            4 -> {
                banda.setBackgroundResource(R.color.Violeta)
                tolerancia = 0.10/100
            }
            5 -> {
                banda.setBackgroundResource(R.color.Gris)
                tolerancia = 0.05/100
            }
        }
    }
    fun BackgroundColorsetMultiplicado4 (banda: ImageView, pos: Int){
        when(pos){
            0 -> {
                banda.setBackgroundResource(R.color.Negro)
                multiplicador = 1
            }
            1 -> {
                banda.setBackgroundResource(R.color.Marron)
                multiplicador = 10
            }
            2 -> {
                banda.setBackgroundResource(R.color.Rojo)
                multiplicador = 100
            }
            3 -> {
                banda.setBackgroundResource(R.color.Naranja)
                multiplicador = 1000
            }
            4 -> {
                banda.setBackgroundResource(R.color.Amarillo)
                multiplicador = 10000
            }
            5 -> {
                banda.setBackgroundResource(R.color.Verde)
                multiplicador = 100000
            }
            6 -> {
                banda.setBackgroundResource(R.color.Azul)
                multiplicador = 1000000
            }
            7 -> {
                banda.setBackgroundResource(R.color.Violeta)
                multiplicador = 10000000
            }
            8 -> {
                banda.setBackgroundResource(R.color.Gris)
                multiplicador = 100000000
            }
            9 -> {
                banda.setBackgroundResource(R.color.Blanco)
                multiplicador = 1000000000
            }
        }

        //Toast.makeText(this, varbanda1.toString(), Toast.LENGTH_SHORT).show()
    }

    fun BackgroundColorsetMultiplicado5 (banda: ImageView, pos: Int){
        when(pos){
            0 -> {
                banda.setBackgroundResource(R.color.Negro)
                multiplicador = 1
            }
            1 -> {
                banda.setBackgroundResource(R.color.Marron)
                multiplicador = 10
            }
            2 -> {
                banda.setBackgroundResource(R.color.Rojo)
                multiplicador = 100
            }
            3 -> {
                banda.setBackgroundResource(R.color.Naranja)
                multiplicador = 1000
            }
            4 -> {
                banda.setBackgroundResource(R.color.Amarillo)
                multiplicador = 10000
            }
            5 -> {
                banda.setBackgroundResource(R.color.Verde)
                multiplicador = 100000
            }
            6 -> {
                banda.setBackgroundResource(R.color.Azul)
                multiplicador = 1000000
            }
            7 -> {
                banda.setBackgroundResource(R.color.Violeta)
                multiplicador = 10000000
            }
        }

        //Toast.makeText(this, varbanda1.toString(), Toast.LENGTH_SHORT).show()
    }
    fun BackgroundColorsetDefault(banda1: ImageView, banda2: ImageView, banda3: ImageView, multi: ImageView, toler: ImageView, sp1: Spinner , sp2: Spinner, sp3: Spinner,sp4_4: Spinner,sp4_5: Spinner, sp5_4: Spinner,sp5_5: Spinner){
        sp1.setEnabled(false)
        sp2.setEnabled(false)
        sp3.setEnabled(false)
        sp4_4.setEnabled(false)
        sp4_5.setEnabled(false)
        sp5_4.setEnabled(false)
        sp5_5.setEnabled(false)

        banda1.setBackgroundColor(Color.TRANSPARENT)
        banda2.setBackgroundColor(Color.TRANSPARENT)
        banda3.setBackgroundColor(Color.TRANSPARENT)
        multi.setBackgroundColor(Color.TRANSPARENT)
        toler.setBackgroundColor(Color.TRANSPARENT)

        varbanda1 = 0
        varbanda2 = 0
        varbanda3= 0
        multiplicador= 0
        tolerancia= 0.0

    }

}