package com.mtnstech.mathfacts.operators

enum class Operation(val displayName: String, val displayText: String) {
    ADDITION("Addition", "+"),
    SUBTRACTION("Subtraction","-"),
    MULTIPLICATION("Multiplication", "X"),
    DIVISION("Division", "/")
}

class Equation(val firstNumber: Int, val secondNumber: Int, val correctAnswer: Int, val operation: Operation){
    fun verifyAnswer(submittedAnswer: Int): Boolean {
        return submittedAnswer == correctAnswer
    }
}