package com.org.eletriccarapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var value: EditText
    lateinit var distance: EditText
    lateinit var btnCalculate: Button
    lateinit var resultAutonomy: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupViews()
        setupListeners()
    }

    fun setupViews(){
        value = findViewById(R.id.et_value)
        distance = findViewById(R.id.et_distance)
        btnCalculate = findViewById(R.id.btn_calculate)
        resultAutonomy = findViewById(R.id.tv_result_autonomy)
    }

    fun setupListeners(){
        btnCalculate.setOnClickListener {
            val price = value.text.toString().toFloat()
            val kmDistance = distance.text.toString().toFloat()


            val result = price/kmDistance

            resultAutonomy.text = "$result"

        }
    }
}