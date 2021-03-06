package com.example.calculadora_de_notas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular:Button = calcular
        val resultado:TextView = resultado
        btCalcular.setOnClickListener {
            val nota_1 = Integer.parseInt((nota1.text.toString()))
            val nota_2 = Integer.parseInt((nota2.text.toString()))
            val media = (nota_1+nota_2)/2
            val faltas = Integer.parseInt((faltas.text.toString()))

            if(media >= 6 && faltas <= 10){
                resultado.setText("Aluno aprovado!\nMedia: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno resprovado!\nMedia: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}