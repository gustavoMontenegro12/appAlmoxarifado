package com.example.controledealmoxarifado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EntradaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrada)

        //CAMPOS COM OS DADOS
        val mEditTextCodigo = findViewById<EditText>(R.id.editTextCodigo)
        val mEditTextNome = findViewById<EditText>(R.id.editTextNome)
        val mEditTextQuantidade = findViewById<EditText>(R.id.editTextQuantidade)
        val mEditTextTipo = findViewById<EditText>(R.id.editTextDepartamento)
        val mEditTextDepartamento = findViewById<EditText>(R.id.editTextDepartamento)
        val mEditTextOrigem = findViewById<EditText>(R.id.editTextOrigem)
        val mEditTextFornecedor = findViewById<EditText>(R.id.editTextFornecedor)

        //BOTÕES
        val mButtonCadastrarEntrada = findViewById<Button>(R.id.buttonCadastrarEntrada)
        val mButtonVoltar = findViewById<Button>(R.id.buttonVoltar)

        mButtonCadastrarEntrada.setOnClickListener{
            //ATRIBUIR OS ELEMENTOS AS VARIÁVEIS
            val codigo = mEditTextCodigo.text.toString()
            val nome = mEditTextNome.text.toString().toUpperCase()
            val quantidade = mEditTextQuantidade.text.toString()
            val tipo = mEditTextTipo.text.toString().toUpperCase()
            val departamento = mEditTextDepartamento.text.toString().toUpperCase()
            val origem = mEditTextOrigem.text.toString().toUpperCase()
            val fornecedor = mEditTextFornecedor.text.toString().toUpperCase()

            //Interação com a tela de resultado
            val intent = Intent(this@EntradaActivity, ResultadoEntradaActivity::class.java)

            //LEVAR AS VAIÁVEIS ATÉ A TELA DE RESULTADO
            intent.putExtra("EXTRA_CODIGO", codigo)
            intent.putExtra("EXTRA_NOME", nome)
            intent.putExtra("EXTRA_QUANTIDADE", quantidade)
            intent.putExtra("EXTRA_TIPO", tipo)
            intent.putExtra("EXTRA_DEPARTAMENTO", departamento)
            intent.putExtra("EXTRA_ORIGEM", origem)
            intent.putExtra("EXTRA_FORNECEDOR", fornecedor)

            startActivity(intent)
        }

        mButtonVoltar.setOnClickListener{

            val intentVoltar = Intent(this@EntradaActivity, MainActivity::class.java)
            startActivity(intentVoltar)
        }
    }
}