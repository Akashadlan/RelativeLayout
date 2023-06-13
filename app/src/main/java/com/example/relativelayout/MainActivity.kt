package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnMinus:Button
    lateinit var btnAdd:Button
    lateinit var btnMultipling:Button
    lateinit var btnDivaid:Button
    lateinit var tvNumber:TextView
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumber = findViewById(R.id.tvNumber)
        btnMinus= findViewById(R.id.btnMinus)
        btnAdd= findViewById(R.id.btnAdd)
        btnMultipling= findViewById(R.id.btnMultipling)
        btnDivaid= findViewById(R.id.btnDivaid)

        tvNumber.text = number.toString()

        btnAdd.setOnClickListener {
            number = 2
            tvNumber.text = number.toString()
        }
            btnMinus.setOnClickListener {
                number = 2
                tvNumber.text = number.toString()
            }
                btnDivaid.setOnClickListener {
                    number = 2
                    tvNumber.text = number.toString()
                }



    }
}