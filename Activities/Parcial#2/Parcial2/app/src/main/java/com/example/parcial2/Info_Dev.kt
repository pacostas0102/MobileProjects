package com.example.parcial2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Info_Dev : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_dev)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.home ->{
            msg("Home")
            startActivity(Intent(this, MainActivity::class.java))
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