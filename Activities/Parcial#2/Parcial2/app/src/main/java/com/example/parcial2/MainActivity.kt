package com.example.parcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
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
        R.id.actors ->{
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