package com.mtnstech.mathfacts

import com.mtnstech.mathfacts.operators.Equation
import com.mtnstech.mathfacts.operators.Operation
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class EquationTests {
    @Test
    fun equation_CheckRightAnswerTest(){
        val equation = Equation(1,2,3, Operation.ADDITION)

        assertTrue (equation.submitAnswer(3))
    }

    @Test
    fun equation_CheckWrongAnswerTest(){
        val equation = Equation(1,2,3, Operation.ADDITION)

        assertFalse(equation.submitAnswer(4))
    }

    @Test
    fun equation_CheckRightAnswerTest_CorrectStatus(){
        val equation = Equation(1,2,3, Operation.ADDITION)
        equation.submitAnswer(3)
        assertTrue(equation.correct())
    }

    @Test
    fun equation_CheckWrongAnswerTest_CorrectStatus(){
        val equation = Equation(1,2,3, Operation.ADDITION)
        equation.submitAnswer(4)
        assertFalse(equation.correct())
    }
}