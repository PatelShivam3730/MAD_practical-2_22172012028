package com.example.mad_practical_2_22172012028

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMassage("oncreate method is called")
    }
    val TAG = "MainActivity"

    fun showMassage(massage : String)
    {
        Log.i(TAG, massage)
        Toast.makeText(this, massage , Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMassage("onstart method is called")
    }

    override fun onResume() {
        super.onResume()
    }
}