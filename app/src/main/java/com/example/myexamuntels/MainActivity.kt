package com.example.myexamuntels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img_insc.setOnClickListener {
            val intent = Intent(this, InscripcionActivity::class.java)
            startActivity(intent)
        }

        img_taller.setOnClickListener {
            val intent = Intent(this, TallerActivity::class.java)
            startActivity(intent)

        }

        img_regl.setOnClickListener {
            val intent = Intent(this, ReglamentoActivity::class.java)
            startActivity(intent)
        }
    }
}