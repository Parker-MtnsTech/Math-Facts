package com.mtnstech.mathfacts.operators

enum class Operation(val displayName: String, val displayText: String, val factory: IEquationFactory) {
    ADDITION("Addition", "+", AdditionEquationFactory()),
    SUBTRACTION("Subtraction","-", SubtractionEquationFactory()),
    MULTIPLICATION("Multiplication", "X", MultiplicationEquationFactory()),
    DIVISION("Division", "/", DivisionEquationFactory())
}

enum class Status {
    HOME,
    IN_PROGRESS,
    RESULTS
}

class Equation(val firstNumber: Int, val secondNumber: Int, val correctAnswer: Int, val operation: Operation, var submittedAnswer: Int = -1){
    fun submitAnswer(answer: Int): Boolean {
        submittedAnswer = answer
        return correct()
    }

    fun correct() = submittedAnswer == correctAnswer
}