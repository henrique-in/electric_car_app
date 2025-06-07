package com.org.eletriccarapp.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.org.eletriccarapp.R

class CalculateAutonomyActivity : AppCompatActivity() {

    lateinit var value: EditText
    lateinit var distance: EditText
    lateinit var btnCalculate: Button
    lateinit var resultAutonomy: TextView
    lateinit var btnGoBack : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_autonomy)

        setupViews()
        setupListeners()
    }
    fun setupViews(){
        value = findViewById(R.id.et_value)
        distance = findViewById(R.id.et_distance)
        btnCalculate = findViewById(R.id.btn_calculate)
        resultAutonomy = findViewById(R.id.tv_result_autonomy)
        btnGoBack = findViewById(R.id.iv_arrow_back)
    }

    fun setupListeners(){
        btnCalculate.setOnClickListener {
           calculate()

        }

        btnGoBack.setOnClickListener {
            finish()
        }
    }


    fun calculate(){
        val price = value.text.toString().toFloat()
        val kmDistance = distance.text.toString().toFloat()


        val result = price/kmDistance

        resultAutonomy.text = "$result"
    }


}