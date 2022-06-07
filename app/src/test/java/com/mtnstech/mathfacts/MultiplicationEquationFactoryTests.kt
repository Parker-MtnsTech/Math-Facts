package com.mtnstech.mathfacts

import com.mtnstech.mathfacts.operators.MultiplicationEquationFactory
import com.mtnstech.mathfacts.operators.Operation
import org.junit.Test
import org.junit.Assert.*

class MultiplicationEquationFactoryTests {
    @Test
    fun multiplicationEquationFactory_GenerateEquation() {
        val maxNumber = 10
        val factory = MultiplicationEquationFactory()
        val equation = factory.generateEquation(maxNumber)
        assertTrue(equation.firstNumber * equation.secondNumber == equation.correctAnswer)
        assertTrue(equation.operation == Operation.MULTIPLICATION)
        assertTrue(equation.firstNumber <= maxNumber && equation.secondNumber <= maxNumber)
        assertTrue(equation.firstNumber >= 0 && equation.secondNumber >= 0)
    }

    @Test
    fun multiplicationEquationFactory_GenerateEquationWithSpecifiedNumber() {
        val maxNumber = 10
        val practiceNumber = 5
        val factory = MultiplicationEquationFactory()
        val equation = factory.generateEquation(maxNumber, practiceNumber)
        assertTrue(equation.firstNumber == practiceNumber || equation.secondNumber == practiceNumber)
    }
}