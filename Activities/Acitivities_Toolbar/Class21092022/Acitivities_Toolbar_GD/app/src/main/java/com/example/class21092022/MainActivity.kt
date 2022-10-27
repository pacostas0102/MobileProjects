package com.example.class21092022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(R.id.toolbar)
        setSupportActionBar(findViewById(R.id.toolbar))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
       // return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.settings_menu ->{
            msg("Configuración")
            startActivity(Intent(this,ConfigActivity::class.java))
            true
        }
        R.id.fav_menu ->{
            msg("Favoritos")
            startActivity(Intent(this,FavoritosActivity::class.java))
            true
        }
        R.id.money_menu ->{
            msg("MoneyPocket")
            startActivity(Intent(this,MoneyActivity::class.java))
            true
        }
        R.id.email_menu ->{
            msg("Email")
            startActivity(Intent(this,EmailActivity::class.java))
            true
        }
        R.id.help_menu->{
            msg("Ayuda")
            startActivity(Intent(this,AyudaActivity::class.java))
            true
        }
        else-> super.onOptionsItemSelected(item)

        // return super.onCreateOptionsMenu(menu)
    }
    fun msg (msg: String){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
    private fun setSupportActionBar(toolbar: Int) {

    }
}