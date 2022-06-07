package com.mtnstech.mathfacts

import com.mtnstech.mathfacts.operators.Operation
import com.mtnstech.mathfacts.operators.SubtractionEquationFactory
import org.junit.Test
import org.junit.Assert.*

class SubtractionEquationFactoryTests {
    @Test
    fun subtractionEquationFactory_GenerateEquation() {
        val maxNumber = 10
        val factory = SubtractionEquationFactory()
        val equation = factory.generateEquation(maxNumber)
        assertTrue(equation.firstNumber - equation.secondNumber == equation.correctAnswer)
        assertTrue(equation.operation == Operation.SUBTRACTION)
        assertTrue(equation.firstNumber <= maxNumber && equation.secondNumber <= maxNumber)
        assertTrue(equation.firstNumber >= 0 && equation.secondNumber >= 0)
    }

    @Test
    fun subtractionEquationFactory_GeneratePositiveAnswerEquation() {
        val maxNumber = 10
        val factory = SubtractionEquationFactory()

        //in 50 equations we should be able to say that we didn't get a negative answer
        for (i in 1..50){
            val equation = factory.generateEquation(maxNumber)
            assertTrue(equation.correctAnswer >= 0)
        }
    }

    @Test
    fun subtractionEquationFactory_GenerateEquationWithSpecifiedNumber() {
        val maxNumber = 10
        val practiceNumber = 5
        val factory = SubtractionEquationFactory()
        val equation = factory.generateEquation(maxNumber, practiceNumber)
        assertTrue(equation.firstNumber == practiceNumber || equation.secondNumber == practiceNumber)
    }
}