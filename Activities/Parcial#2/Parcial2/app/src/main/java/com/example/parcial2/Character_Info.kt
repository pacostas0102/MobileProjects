package com.example.parcial2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class Character_Info: AppCompatActivity() {

    var name: String = ""
    var lastname : String = " "
    var rol: String = ""
    var profesion: String = " "
    var cargo: String = ""
    var days_out_of_earth: Int = 0

    public override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_info)
        setSupportActionBar(findViewById(R.id.toolbar))

        val nombrePersonaje: TextView = findViewById(R.id.nombrePersonaje)
        val apellidoPersonaje: TextView = findViewById(R.id.apellidoPersonaje)
        val rolPersonaje: TextView = findViewById(R.id.rolPersonaje)
        val profesionPersonaje: TextView = findViewById(R.id.profesionPersonaje)
        val cargoPersonaje: TextView = findViewById(R.id.cargoPersonaje)
        val diasFueraTierra: TextView = findViewById(R.id.diasTierraPersonaje)

        val bundle = intent.extras

        val nombreActor: TextView = findViewById(R.id.nombreActorCharacter)
        val nombre = bundle?.get("firstName").toString()
        nombreActor.setText(nombre)

        if(nombre == "Matt Damon"){
            name = "Mark"
            lastname = "Watney"
            rol = "Personaje Principal"
            profesion = "Astronauta, botánico, ingeniero mecánico"
            cargo = "Astronauta Ares 2"
            days_out_of_earth = 578

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
        if(nombre == "Jessica Chastain"){
            name = "Melissa"
            lastname = "Lewis"
            rol = "Personaje Principal"
            profesion = "Comandante y geóloga"
            cargo = "Comandante y geóloga de la Misión a Marte Ares III"
            days_out_of_earth = 500

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
        if(nombre == "Chiwetel Ejiofor"){
            name = "Vincent "
            lastname = "Kapoor"
            rol = "Personaje Principal"
            profesion = "Director"
            cargo = "Director de la Misión a Marte Ares III"
            days_out_of_earth = 0

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
        if(nombre == "Mackenzie Davis"){
            name = "Mindy "
            lastname = "Park"
            rol = "Personaje Principal"
            profesion = "Comunicadora"
            cargo = " Comunicación satelital de la NASA"
            days_out_of_earth = 500

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
        if(nombre == "Sean Bean"){
            name = "Mitch "
            lastname = "Henderson"
            rol = "Personaje Principal"
            profesion = "Director de Vuelo"
            cargo = "Director de vuelo de la NASA"
            days_out_of_earth = 0

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
        if(nombre == "Jeff Daniels"){
            name = "Teddy "
            lastname = "Sanders"
            rol = "Personaje Principal"
            profesion = "Director"
            cargo = "Director de la NASA"
            days_out_of_earth = 0

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
        if(nombre == "Aksel Hennie"){
            name = "Alex"
            lastname = "Vogel"
            rol = "Personaje Principal"
            profesion = "Astronauta y bioquímico"
            cargo = "Astronauta, bioquímico y navegante del Ares III"
            days_out_of_earth = 500

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
        if(nombre == "Eddy Ko"){
            name = "Guo"
            lastname = "Ming"
            rol = "Personaje Principal"
            profesion = "Director de ciencias"
            cargo = "Director de ciencias de la Administración Espacial China"
            days_out_of_earth = 0

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
        if(nombre == "Nikolett Barabas"){
            name = "Melissa"
            lastname = "Lewis"
            rol = "Personaje Secundario"
            profesion = "Reportera"
            cargo = "Reportera"
            days_out_of_earth = 0

            setCharacterTextView(name, lastname, rol, profesion, cargo, days_out_of_earth, nombrePersonaje, apellidoPersonaje, rolPersonaje, profesionPersonaje, cargoPersonaje, diasFueraTierra)
        }
    }
    private fun setCharacterTextView(name: String, lastname: String, rol: String,profesion: String, cargo: String, days_out_of_earth: Int, nombrePersonaje: TextView, apellidoPersonaje: TextView, rolPersonaje: TextView, profesionPersonaje: TextView, cargoPersonaje: TextView, diasFueraTierra: TextView){
        nombrePersonaje.setText(name)
        apellidoPersonaje.setText(lastname)
        rolPersonaje.setText(rol)
        profesionPersonaje.setText(profesion)
        cargoPersonaje.setText(cargo)
        diasFueraTierra.setText(days_out_of_earth.toString())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.info ->{
            msg("Developers Information")
            startActivity(Intent(this, Info_Dev::class.java))
            true
        }
        R.id.home ->{
            msg("Home")
            startActivity(Intent(this, MainActivity::class.java))
            true
        }
        R.id.actors -> {
            msg("Main Actors Information")
            startActivity(Intent(this, MainActors::class.java))
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    fun msg (msg: String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


}