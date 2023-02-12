package com.example.myapplicationpractica04_permisos01_dsm104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.Manifest
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import android.util.Log

private val TAG = "Practica04 - Permisos"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configurarPermisos()
    }

    private fun configurarPermisos(){
        val permission = ContextCompat.checkSelfPermission(this,Manifest.permission.RECORD_AUDIO)
        if(permission != PackageManager.PERMISSION_GRANTED){Log.i(TAG,"Permiso para grabar denegado")}
    }

}