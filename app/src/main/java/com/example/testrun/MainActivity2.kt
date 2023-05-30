package com.example.testrun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn= findViewById(R.id.btnEdit_Profile)
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "Profile can now be edited", Toast.LENGTH_LONG).show()
        }
    }
}