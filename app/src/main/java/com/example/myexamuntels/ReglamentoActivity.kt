package com.example.myexamuntels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_reglamento.*
import kotlinx.android.synthetic.main.activity_taller.*

class ReglamentoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reglamento)

        val listTalleres = listOf<String>("Mantener la cámara encendida.","Mantener el micrófono apagado","Todas las preguntas por el chat","Puntualidad","Registre su formulario de asistencia","Prohibido el uso de lenguaje que incite al odio","No interrumpir con sonidos en plena exposición")
        val adapter = AdapterTalleres(this, listTalleres)
        rcv_reglamento.apply {
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
            setHasFixedSize(false)
            this.adapter = adapter
            itemAnimator = androidx.recyclerview.widget.DefaultItemAnimator()
        }

        btn_atras2.setOnClickListener {
            finish()
        }

    }
}