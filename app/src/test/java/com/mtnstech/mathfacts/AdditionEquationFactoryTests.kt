package com.mtnstech.mathfacts

import com.mtnstech.mathfacts.operators.AdditionEquationFactory
import com.mtnstech.mathfacts.operators.Operation
import org.junit.Test
import org.junit.Assert.*

class AdditionEquationFactoryTests {
    @Test
    fun additionEquationFactory_GenerateEquation() {
        val maxNumber = 10
        val factory = AdditionEquationFactory()
        val equation = factory.generateEquation(maxNumber)
        assertTrue(equation.firstNumber + equation.secondNumber == equation.correctAnswer)
        assertTrue(equation.operation == Operation.ADDITION)
        assertTrue(equation.firstNumber <= maxNumber && equation.secondNumber <= maxNumber)
        assertTrue(equation.firstNumber >= 0 && equation.secondNumber >= 0)
    }

    @Test
    fun additionEquationFactory_GenerateEquationWithSpecifiedNumber() {
        val maxNumber = 10
        val practiceNumber = 5
        val factory = AdditionEquationFactory()
        val equation = factory.generateEquation(maxNumber, practiceNumber)
        assertTrue(equation.firstNumber == practiceNumber || equation.secondNumber == practiceNumber)
    }
}