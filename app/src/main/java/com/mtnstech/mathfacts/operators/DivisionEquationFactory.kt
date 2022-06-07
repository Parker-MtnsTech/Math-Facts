package com.mtnstech.mathfacts.operators

import kotlin.random.Random

class DivisionEquationFactory: IEquationFactory {
    override fun generateEquation(maxNumber: Int, practiceNumber: Int?): Equation {
        var firstNumber = -1
        var secondNumber = -1

        if(practiceNumber != null) {
            if (Random.nextBoolean()) {
                firstNumber = practiceNumber
                secondNumber = Random.nextInt(1, practiceNumber)
            } else {
                secondNumber = practiceNumber
                firstNumber = Random.nextInt(practiceNumber, maxNumber)
            }
        }else{
            firstNumber = Random.nextInt(1, maxNumber)
            secondNumber = Random.nextInt(1, firstNumber)
        }

        return Equation(firstNumber, secondNumber, firstNumber - secondNumber, Operation.DIVISION)
    }
}