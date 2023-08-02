package com.example.mad_practical_2_22172012028

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

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
        val obj:ConstraintLayout?=findViewById(R.id.mainConstraint)
        if (obj!=null)
        {
            Snackbar.make(obj,massage,Snackbar.LENGTH_SHORT)
        }
    }

    override fun onStart() {
            super.onStart()
        showMassage("onStart method is called")
    }

    override fun onResume() {
        super.onResume()
    }
    override fun onPause() {
        super.onPause()
        showMassage("onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        showMassage("onStop method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMassage("onRestart method is called")
    }
}