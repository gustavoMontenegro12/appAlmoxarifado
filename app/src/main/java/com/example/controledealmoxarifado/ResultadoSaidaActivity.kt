package com.example.controledealmoxarifado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoSaidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_saida)

        //TRAZENDO OS DADOS DA TELA ANTERIOR
        val intent = intent
        val codigo = intent.getStringExtra("EXTRA_CODIGO")
        val nome = intent.getStringExtra("EXTRA_NOME")
        val quantidade = intent.getStringExtra("EXTRA_QUANTIDADE")
        val tipo = intent.getStringExtra("EXTRA_TIPO")
        val departamento = intent.getStringExtra("EXTRA_DEPARTAMENTO")
        val requisitante = intent.getStringExtra("EXTRA_REQUISITANTE")
        val finalidade = intent.getStringExtra("EXTRA_FINALIDADE")


        //BOTÕES
        val mButtonVoltar = findViewById<Button>(R.id.buttonVoltar)
        val mButtonInicio = findViewById<Button>(R.id.buttonInicio)

        //Resultado impresso
        val mTextViewResultado = findViewById<TextView>(R.id.textViewResultado)
        mTextViewResultado.setText("Código: $codigo\nNome: $nome\nQuantidade: $quantidade\nTipo: $tipo\nDepartamento: $departamento\nRequisitante: $requisitante\nFinalidade: $finalidade")

        mButtonInicio.setOnClickListener {
            val intentInicio = Intent(this@ResultadoSaidaActivity, MainActivity::class.java)
            startActivity(intentInicio)
        }

        mButtonVoltar.setOnClickListener {
            val intentVoltar = Intent(this@ResultadoSaidaActivity, SaidaActivity::class.java)
            startActivity(intentVoltar)
        }
    }
}