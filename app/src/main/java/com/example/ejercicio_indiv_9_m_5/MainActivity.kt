package com.example.ejercicio_indiv_9_m_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.ejercicio_indiv_9_m_5.databinding.ActivityMainBinding
import java.util.Scanner
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    /*********** EJERCICIO 9 MÓDULO 5 ***********/
}
   fun main() {
        val scanner = Scanner(System.`in`)
        var continuar = true

        while (continuar) {
            println("Ingrese una temperatura:")
            val temperatura = scanner.nextDouble()

            println("Seleccione la escala de temperatura:")
            println("1. Celsius")
            println("2. Fahrenheit")
            println("3. Kelvin")

            when (scanner.nextInt()) {
                1 -> convertirCelsius(temperatura)
                2 -> convertirFahrenheit(temperatura)
                3 -> convertirKelvin(temperatura)
                else -> println("Opción inválida")
            }
            println("¿Desea realizar otra conversión? (Sí/No)")
            val respuesta = scanner.next()
            if (respuesta.equals("No", ignoreCase = true)) {
                continuar = false
            }
        }
    }

    fun convertirCelsius(temperatura: Double) {
        val fahrenheit = (9.0 / 5.0 * temperatura) + 32.0
        val kelvin = temperatura + 273.15
        println()
        println("$temperatura grados Celsius son:")
        println("> ${String.format("%.2f", fahrenheit)}°Fahrenheit")
        println("> ${String.format("%.2f", kelvin)}°Kelvin")
    }

    fun convertirFahrenheit(temperatura: Double) {
        val celsius = (temperatura - 32.0) * (5.0 / 9.0)
        val kelvin = (5.0 / 9.0 * (temperatura - 32.0)) + 273.15
        println()
        println("$temperatura grados Fahrenheit son:")
        println("> ${String.format("%.2f", celsius)}°Celsius")
        println("> ${String.format("%.2f", kelvin)}°Kelvin")
    }

    fun convertirKelvin(temperatura: Double) {
        val celsius = temperatura - 273.15
        val fahrenheit = (9.0 / 5.0 * (temperatura - 273.15)) + 32.0
        println()
        println("$temperatura grados Kelvin son:")
        println("> ${String.format("%.2f", fahrenheit)}°Fahrenheit")
        println("> ${String.format("%.2f", celsius)}°Celsius")
    }

