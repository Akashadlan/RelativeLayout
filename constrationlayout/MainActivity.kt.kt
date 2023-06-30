package com.example.constrationlayout

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class `MainActivity.kt` : AppCompatActivity() {
    lateinit var btndca : Button
    lateinit var btnmars : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btndca = findViewById(R.id.btndca)
        btnmars = findViewById(R.id.btnmars)

        btndca.setOnClickListener {
            var snackbar = Snackbar.make(btndca,"This is DCA",Snackbar.LENGTH_LONG)
            snackbar.setAnchorView(R.id.btndca)
            snackbar.setAction("OK"){
                Toast.makeText(this, "snackbare", Toast.LENGTH_SHORT).show()
            }
            snackbar.show()
        }
        btnmars.setOnClickListener {
            AlertDialog.Builder(this,)
                .setTitle("This is Title")
                .setMessage("Chose Title")
                .setPositiveButton("positive"){_,_->
                }
                .setNeutralButton("Neutral"){_,_->
                }
                .setNegativeButton("Negative") {_,_->
                }
                .show()

        }
    }
}