package com.example.myexamuntels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_inscripcion.*

class InscripcionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscripcion)

        button.setOnClickListener {
            Toast.makeText(this.applicationContext,"Se registro con exito.",Toast.LENGTH_LONG).show()
            editTextTextPersonName2.setText("")
            editTextTextPersonName3.setText("")
            editTextTextPersonName4.setText("")
            editTextTextPersonName5.setText("")
            editTextTextPersonName6.setText("")
            editTextTextPersonName6.setText("")
            editTextTextPersonName7.setText("")
            editTextTextPersonName8.setText("")
        }

    }
}