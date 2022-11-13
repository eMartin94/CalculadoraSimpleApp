package com.example.calculadorasimpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var op = ""
    var n1: Float = 0.0f
    var n2: Float = 0.0f

    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIgual: Button = findViewById(R.id.btnIgual)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)

        resultado = findViewById(R.id.resultado)

        btnIgual.setOnClickListener {


            n2 = resultado.text.toString().toFloat()
            var calcular = 0.0f

            when (op) {
                "+" -> calcular = n1 + n2
                "-" -> calcular = n1 - n2
                "÷" -> calcular = n1 / n2
                "×" -> calcular = n1 * n2
            }

            resultado.text = calcular.toString()
        }

        btnBorrar.setOnClickListener {
            resultado.text = "0"
            op = ""
        }

    }

    fun numeroPres(view: View) {
        val btnUno: Button = findViewById(R.id.btnUno)
        val btnDos: Button = findViewById(R.id.btnDos)
        val btnTres: Button = findViewById(R.id.btnTres)
        val btnCuatro: Button = findViewById(R.id.btnCuatro)
        val btnCinco: Button = findViewById(R.id.btnCinco)
        val btnSeis: Button = findViewById(R.id.btnSeis)
        val btnSiete: Button = findViewById(R.id.btnSiete)
        val btnOcho: Button = findViewById(R.id.btnOcho)
        val btnNueve: Button = findViewById(R.id.btnNueve)
        val btnCero: Button = findViewById(R.id.btnCero)
        val btnPunto: Button = findViewById(R.id.btnPunto)

        var n1 = resultado.text.toString()

        when (view) {
            btnUno -> {
                if (n1 == "0") {
                    resultado.text = "1"
                } else {
                    resultado.text = "${n1}1"
                }
            }
            btnDos -> {
                if (n1 == "0") {
                    resultado.text = "2"
                } else {
                    resultado.text = "${n1}2"
                }
            }
            btnTres -> {
                if (n1 == "0") {
                    resultado.text = "3"
                } else {
                    resultado.text = "${n1}3"
                }
            }
            btnCuatro -> {
                if (n1 == "0") {
                    resultado.text = "4"
                } else {
                    resultado.text = "${n1}4"
                }
            }
            btnCinco -> {
                if (n1 == "0") {
                    resultado.text = "5"
                } else {
                    resultado.text = "${n1}5"
                }
            }
            btnSeis -> {
                if (n1 == "0") {
                    resultado.text = "6"
                } else {
                    resultado.text = "${n1}6"
                }
            }
            btnSiete -> {
                if (n1 == "0") {
                    resultado.text = "7"
                } else {
                    resultado.text = "${n1}7"
                }
            }
            btnOcho -> {
                if (n1 == "0") {
                    resultado.text = "8"
                } else {
                    resultado.text = "${n1}8"
                }
            }
            btnNueve -> {
                if (n1 == "0") {
                    resultado.text = "9"
                } else {
                    resultado.text = "${n1}9"
                }
            }
            btnCero -> {
                if (n1 == "0") {
                    resultado.text = "0"
                } else {
                    resultado.text = "${n1}0"
                }
            }
            btnPunto -> {
                if (n1 == "0") {
                    resultado.text = "."
                } else {
                    resultado.text = "$n1."
                }
            }

        }
    }

    fun operadorPres(view: View) {

        val btnSuma: Button = findViewById(R.id.btnSuma)
        val btnResta: Button = findViewById(R.id.btnResta)
        val btnMultiplicacion: Button = findViewById(R.id.btnMultiplicacion)
        val btnDivision: Button = findViewById(R.id.btnDivision)

        n2 = resultado.text.toString().toFloat()
        n1 = n2
        resultado.text = ""

        when (view) {
            btnSuma -> {
                resultado.text = n2.toString()
                op = "+"
                resultado.text = ""
            }

            btnResta -> {
                resultado.text = n2.toString()
                op = "-"
                resultado.text = ""
            }

            btnMultiplicacion -> {
                resultado.text = n2.toString()
                op = "×"
                resultado.text = ""
            }

            btnDivision -> {
                resultado.text = n2.toString()
                op = "÷"
                resultado.text = ""
            }
        }
    }
}