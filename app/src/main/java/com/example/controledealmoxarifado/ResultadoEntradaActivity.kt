package com.example.controledealmoxarifado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoEntradaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_entrada)

        val intent = intent

        //TRAZENDO OS DADOS DA TELA ANTERIOR
        val codigo = intent.getStringExtra("EXTRA_CODIGO")
        val nome = intent.getStringExtra("EXTRA_NOME")
        val quantidade = intent.getStringExtra("EXTRA_QUANTIDADE")
        val tipo = intent.getStringExtra("EXTRA_TIPO")
        val departamento = intent.getStringExtra("EXTRA_DEPARTAMENTO")
        val origem = intent.getStringExtra("EXTRA_ORIGEM")
        val fornecedor = intent.getStringExtra("EXTRA_FORNECEDOR")

        //BOTÕES
        val mButtonVoltar = findViewById<Button>(R.id.buttonVoltar)
        val mButtonInicio = findViewById<Button>(R.id.buttonInicio)


        val mTextViewResultadoEntrada = findViewById<TextView>(R.id.textViewResultadoEntrada)
        mTextViewResultadoEntrada.setText("Código: $codigo\nNome: $nome\nQuantidade: $quantidade\nTipo: $tipo\nDepartamento: $departamento\nOrigem: $origem\nFornecedor: $fornecedor")

        mButtonVoltar.setOnClickListener{
            val intentVoltar = Intent(this@ResultadoEntradaActivity, EntradaActivity::class.java)
            startActivity(intentVoltar)
        }

        mButtonInicio.setOnClickListener {
            val intentInicio = Intent(this@ResultadoEntradaActivity, MainActivity::class.java)
            startActivity(intentInicio)
        }
    }
}