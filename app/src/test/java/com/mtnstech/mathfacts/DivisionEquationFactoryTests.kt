package com.mtnstech.mathfacts

import com.mtnstech.mathfacts.operators.DivisionEquationFactory
import com.mtnstech.mathfacts.operators.Operation
import org.junit.Test
import org.junit.Assert.*

class DivisionEquationFactoryTests {
    @Test
    fun divisionEquationFactory_GenerateEquation() {
        val maxNumber = 10
        val factory = DivisionEquationFactory()
        val equation = factory.generateEquation(maxNumber)
        assertTrue(equation.operation == Operation.DIVISION)
        assertTrue(equation.firstNumber <= maxNumber && equation.secondNumber <= maxNumber)
        assertTrue(equation.firstNumber >= 0 && equation.secondNumber > 0)
    }

    @Test
    fun divisionEquationFactory_ValidEquationNumbers() {
        val maxNumber = 10
        val factory = DivisionEquationFactory()
        for(i in 1..20) {
            val equation = factory.generateEquation(maxNumber)
            assertTrue(equation.firstNumber % equation.secondNumber == 0)
            assertTrue(equation.firstNumber / equation.secondNumber == equation.correctAnswer)
        }
    }

    @Test
    fun divisionEquationFactory_GenerateEquationWithSpecifiedNumber() {
        val maxNumber = 10
        val practiceNumber = 5
        val factory = DivisionEquationFactory()
        val equation = factory.generateEquation(maxNumber, practiceNumber)
        assertTrue(equation.firstNumber == practiceNumber || equation.secondNumber == practiceNumber)
    }
}