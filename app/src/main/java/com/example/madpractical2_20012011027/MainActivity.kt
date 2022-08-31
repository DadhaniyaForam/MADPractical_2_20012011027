package com.example.madpractical2_20012011027

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG, "onCreate:Function called ")
        Toast.makeText(this, "onCreate:Function called", Toast.LENGTH_SHORT).show()

        Snackbar.make(mycl,"onCreate:Function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart:Function called ")
        Toast.makeText(this, "onStart:Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStart:Function called",Snackbar.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart:Function called ")
        Toast.makeText(this, "onRestart:Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onRestart:Function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume:Function called ")
        Toast.makeText(this, "onResume:Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onResume:Function called",Snackbar.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop:Function called ")
        Toast.makeText(this, "onStop:Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStop:Function called",Snackbar.LENGTH_LONG).show()
    }
}