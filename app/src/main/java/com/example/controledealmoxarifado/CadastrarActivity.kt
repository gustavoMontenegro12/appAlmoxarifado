package com.example.controledealmoxarifado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CadastrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        //CAMPOS DE DADOS
        val mEditTextCodigo = findViewById<EditText>(R.id.editTextCodigo)
        val mEditTextNome = findViewById<EditText>(R.id.editTextNome)
        //Não se Cadastra quantidades
        //val mEditTextQuantidade = findViewById<EditText>(R.id.editTextNome)
        val mEditTextTipo = findViewById<EditText>(R.id.editTextTipo)
        val mEditTextDepartamento = findViewById<EditText>(R.id.editTextDepartamento)

        //BOTÕES
        val mButtonCasdastrarProduto = findViewById<Button>(R.id.buttonCadastrarProduto)
        val mButtonVoltar = findViewById<Button>(R.id.buttonVoltar)

        mButtonVoltar.setOnClickListener{
            val intentVoltar = Intent(this@CadastrarActivity, MainActivity::class.java)
            startActivity(intentVoltar)
        }

        mButtonCasdastrarProduto.setOnClickListener{

            val codigo = mEditTextCodigo.text.toString()
            val nome = mEditTextNome.text.toString().toUpperCase()
            val tipo = mEditTextTipo.text.toString().toUpperCase()
            val departamento = mEditTextDepartamento.text.toString().toUpperCase()

            val intent = Intent(this@CadastrarActivity, ResultadoCadastroActivity::class.java)
            intent.putExtra("EXTRA_CODIGO", codigo)
            intent.putExtra("EXTRA_NOME", nome)
            intent.putExtra("EXTRA_TIPO", tipo)
            intent.putExtra("EXTRA_DEPARTAMENTO", departamento)

            startActivity(intent)
        }

    }
}