package eu.tutorials.calculator

sealed class CalculatorOperation(val symbol: String) {
    object Addition: CalculatorOperation("+")
    object Substract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("*")
    object Divide: CalculatorOperation("/")
}