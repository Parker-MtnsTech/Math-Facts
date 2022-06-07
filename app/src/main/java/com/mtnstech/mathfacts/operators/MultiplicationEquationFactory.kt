package com.mtnstech.mathfacts.operators

import kotlin.random.Random

class MultiplicationEquationFactory: IEquationFactory {
    override fun generateEquation(maxNumber: Int, practiceNumber: Int?): Equation {
        var firstNumber = Random.nextInt(0, maxNumber)
        var secondNumber = Random.nextInt(0, maxNumber)

        if(practiceNumber != null) {
            if (Random.nextBoolean()) {
                firstNumber = practiceNumber
            } else {
                secondNumber = practiceNumber
            }
        }

        return Equation(firstNumber, secondNumber, firstNumber * secondNumber, Operation.MULTIPLICATION)
    }
}