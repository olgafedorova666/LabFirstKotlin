package com.example.labfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       window.setFtags(WindowsManager.LayoutParams.FLAG_SECURE, WindowsManager.LayoutParams.FLAG_SECURE)
    }
}