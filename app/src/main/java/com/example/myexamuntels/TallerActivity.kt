package com.example.myexamuntels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_taller.*

class TallerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taller)

        val listTalleres = listOf<String>("BigData ","SQL and PL/SQL","Machine Learnig","Android","HTML5","C++","ADM","SCRUM")
        val adapter = AdapterTalleres(this, listTalleres)
        rcv_talleres.apply {
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
            setHasFixedSize(false)
            this.adapter = adapter
            itemAnimator = androidx.recyclerview.widget.DefaultItemAnimator()
        }

        btn_atras.setOnClickListener {
            finish()
        }

    }
}