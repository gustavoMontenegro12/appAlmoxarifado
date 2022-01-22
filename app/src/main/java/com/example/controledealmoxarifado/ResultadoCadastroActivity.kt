package com.example.controledealmoxarifado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoCadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_cadastro)

        //CAMPO ONDE SERÃO MOSTRADDOS OS DADOS
        val mTextViewResultadoCadastro = findViewById<TextView>(R.id.textViewResultadoCadastro)

        //BOTÕES
        val mButtonVoltar = findViewById<Button>(R.id.buttonVoltar)
        val mButtonInicio = findViewById<Button>(R.id.buttonInicio)

        //TRAZER OS DADOS DE OUTRA TELA
        val intent = intent
        val codigo = intent.getStringExtra("EXTRA_CODIGO")
        val nome = intent.getStringExtra("EXTRA_NOME")
        val tipo = intent.getStringExtra("EXTRA_TIPO")
        val departamento = intent.getStringExtra("EXTRA_DEPARTAMENTO")

        mTextViewResultadoCadastro.setText("Código: $codigo\nNome: $nome\nTipo: $tipo\nDepartamento: $departamento")

        mButtonVoltar.setOnClickListener{

            val intentVoltar = Intent(this@ResultadoCadastroActivity, CadastrarActivity::class.java)
            startActivity(intentVoltar)
        }

        mButtonInicio.setOnClickListener {
            val intentInicio = Intent(this@ResultadoCadastroActivity, MainActivity::class.java)
            startActivity(intentInicio)
        }
    }
}