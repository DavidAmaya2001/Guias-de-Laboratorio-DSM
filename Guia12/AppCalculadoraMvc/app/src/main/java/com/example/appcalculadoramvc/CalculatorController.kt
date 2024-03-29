package edu.udb.appcalculadoramvc

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.appcalculadoramvc.CalculatorModel
import com.example.appcalculadoramvc.R


class CalculatorController(private val view: MainActivity) {

    private val model = CalculatorModel()

    init {
        // Asociar eventos de clic a los botones
        view.findViewById<Button>(R.id.btn_add).setOnClickListener { performOperation("add") }
        view.findViewById<Button>(R.id.btn_subtract).setOnClickListener { performOperation("subtract") }
        view.findViewById<Button>(R.id.btn_multiply).setOnClickListener { performOperation("multiply") }
        view.findViewById<Button>(R.id.btn_divide).setOnClickListener { performOperation("divide") }
        view.findViewById<Button>(R.id.btn_sqrt).setOnClickListener{ performOperation("square_root")}
    }

    private fun performOperation(operation: String) {
        // Obtener los números ingresados por el usuario
        val num1 = view.findViewById<EditText>(R.id.num1).text.toString().toDouble()
        val num2 = view.findViewById<EditText>(R.id.num2).text.toString().toDouble()

        // Realizar la operación correspondiente
        val result = when (operation) {
            "add" -> model.add(num1, num2)
            "subtract" -> model.subtract(num1, num2)
            "multiply" -> model.multiply(num1, num2)
            "divide" -> model.divide(num1, num2)
            "square_root" -> model.square_root(num1)
            else -> throw IllegalArgumentException("Operación no válida")
        }

        // Actualizar la vista con el resultado
        view.findViewById<TextView>(R.id.result).text = "Resultado: $result"
    }
}