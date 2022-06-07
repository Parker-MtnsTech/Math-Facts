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

        assertTrue (equation.verifyAnswer(3))
    }

    @Test
    fun equation_CheckWrongAnswerTest(){
        val equation = Equation(1,2,3, Operation.ADDITION)

        assertFalse(equation.verifyAnswer(4))
    }
}