package com.example.controledealmoxarifado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButtonCadastar = findViewById<Button>(R.id.buttonCadastrar)
        val mButtonEntrada = findViewById<Button>(R.id.buttonEntrada)
        val mButtonSaida = findViewById<Button>(R.id.buttonSaida)

        mButtonCadastar.setOnClickListener{
            val intent = Intent(this@MainActivity, CadastrarActivity::class.java)
            startActivity(intent)
        }

        mButtonEntrada.setOnClickListener {
            val intent = Intent(this@MainActivity, EntradaActivity::class.java)
            startActivity(intent)
        }

        mButtonSaida.setOnClickListener {
            val intent = Intent(this@MainActivity, SaidaActivity::class.java)
            startActivity(intent)
        }
    }
}