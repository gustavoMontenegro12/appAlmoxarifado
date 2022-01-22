package com.example.controledealmoxarifado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SaidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saida)

        //VARIAVEIS ATRIBUIDAS COM OS VALORES DOS CAMPOS COM DADOS DE SAIDA DE PRODUTOS
        val mEditTextCodigo = findViewById<EditText>(R.id.editTextCodigo)
        val mEditeTextNome = findViewById<EditText>(R.id.editTextNome)
        val mEditTextQuantidade = findViewById<EditText>(R.id.editTextQuantidade)
        val mEditTextTipo = findViewById<EditText>(R.id.editTextTipo)
        val mEditTextDepartamento = findViewById<EditText>(R.id.editTextDepartamento)
        val mEditTextRequisitante = findViewById<EditText>(R.id.editTextRequisitante)
        val mEditTextFinalidade = findViewById<EditText>(R.id.editTextFinalidade)

        //BOTÕES
        val mButtonCadastrarSaida = findViewById<Button>(R.id.buttonCadastrarSaida)
        val mButtonVoltar = findViewById<Button>(R.id.buttonVoltar)

        //ENVIAR DADOS PARA A PROXIMA TELA

        mButtonCadastrarSaida.setOnClickListener {
            val codigo = mEditTextCodigo.text.toString()
            val nome = mEditeTextNome.text.toString().toUpperCase()
            val quantidade = mEditTextQuantidade.text.toString()
            val tipo = mEditTextTipo.text.toString().toUpperCase()
            val departamento = mEditTextDepartamento.text.toString().toUpperCase()
            val requisitante = mEditTextRequisitante.text.toString().toUpperCase()
            val finalidade = mEditTextFinalidade.text.toString().toUpperCase()

            val intent = Intent(this@SaidaActivity, ResultadoSaidaActivity::class.java)
            intent.putExtra("EXTRA_CODIGO", codigo)
            intent.putExtra("EXTRA_NOME", nome)
            intent.putExtra("EXTRA_QUANTIDADE", quantidade)
            intent.putExtra("EXTRA_TIPO", tipo)
            intent.putExtra("EXTRA_DEPARTAMENTO", departamento)
            intent.putExtra("EXTRA_REQUISITANTE", requisitante)
            intent.putExtra("EXTRA_FINALIDADE", finalidade)

            startActivity(intent)
        }

        mButtonVoltar.setOnClickListener {
            val intentVoltar = Intent(this@SaidaActivity, MainActivity::class.java)
            startActivity(intentVoltar)
        }

    }
}