package com.example.testrun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testrun.databinding.ActivitySample3Binding

class Sample3 : AppCompatActivity() {
    private lateinit var  binding:ActivitySample3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivitySample3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfirm.setOnClickListener {
            val textValue:String = binding.editTxtInput.text.toString()
            binding.txtViewResult.text =textValue
        }
    }
}