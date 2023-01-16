package com.sigmotoa.lifecycle

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.sigmotoa.lifecycle.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity(), OnFragmentActionsListener {



    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private var mediaPlayer: MediaPlayer? = null
    private var currentSong: MutableList<Int> =mutableListOf(R.raw.audio1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController=Navigation.findNavController(this, R.id.host_fragment)
        setupWithNavController(binding.bottomNavigationView, navController)

        var fab_play :Button= findViewById(R.id.fab_play)
        var fab_pause :Button= findViewById(R.id.fab_pause)
        var fab_stop :Button= findViewById(R.id.fab_stop)
        var txtDuration: TextView = findViewById(R.id.txtduration)
        val seekbar: SeekBar = findViewById(R.id.seekbar)

        //mediaPlayer = MediaPlayer.create(this, R.raw.money3)
        //mediaPlayer?.start()
        mediaPlayer?.seekTo(0)

        controlSound(txtDuration, fab_play, fab_pause, fab_stop,seekbar)

        Log.i("LifeCycle", "OnCreate")
    }


    private fun controlSound (txtDuration: TextView, fab_play:Button, fab_pause:Button, fab_stop:Button,seekbar: SeekBar){

        fab_play.setOnClickListener{
            onStart(seekbar,txtDuration)
        }

        fab_pause.setOnClickListener{
            onPause(txtDuration)
        }

        fab_stop.setOnClickListener{
            onStop(txtDuration)
        }

        seekbar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p2) {
                    mediaPlayer?.seekTo(p1)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                    mediaPlayer?.seekTo(0)
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
    }

    private fun initialiseSeekBar(seekbar: SeekBar, txtDuration: TextView){
        seekbar.max = mediaPlayer!!.duration

        val handler= Handler()
        handler.postDelayed(object:Runnable{
            override fun run() {
                try{
                    txtDuration.setText("${mediaPlayer!!.currentPosition/1000} seconds")
                    seekbar.progress = mediaPlayer!!.currentPosition
                    handler.postDelayed(this, 1000)
                }catch (e: Exception) {
                    seekbar.progress = 0
                }
            }
        }, 0)
    }

    private fun onStart(seekbar: SeekBar, txtDuration: TextView) {
        super.onStart()
        if (mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(this,R.raw.audio1)
            Log.d("MainActivity", "ID: ${mediaPlayer!!.audioSessionId}")
            initialiseSeekBar(seekbar,txtDuration)
        }
        mediaPlayer?.start()
        Log.d("MainActivity", "DURATION: ${mediaPlayer!!.duration/1000} seconds")
        Log.i("LifeCycle", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "OnResume")
    }
    private fun onPause(txtDuration: TextView) {
        super.onPause()
        if (mediaPlayer !== null) {
            mediaPlayer?.pause()
            txtDuration.setText("${mediaPlayer!!.currentPosition/1000}")
            Log.d("MainActivity", "PAUSED AT: ${mediaPlayer!!.currentPosition/1000} seconds")
        }
        Log.i("LifeCycle", "OnPause")
    }

    private fun onStop(txtDuration: TextView) {
        super.onStop()
        if (mediaPlayer !== null){
            mediaPlayer?.seekTo(0)
            mediaPlayer?.stop()
            onRestart(txtDuration)
            mediaPlayer = null
        }
        Log.i("LifeCycle", "OnStop")

    }

    private fun onRestart(txtDuration: TextView) {
        super.onRestart()
        mediaPlayer?.reset()
        txtDuration.setText("0 second")
        mediaPlayer?.release()
        Log.i("LifeCycle", "OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycle", "OnRestart")
    }

    override fun onCLickFragmentButton() {
        Toast.makeText(this, "El boton ha sido pulsado", Toast.LENGTH_SHORT).show()
    }


}

