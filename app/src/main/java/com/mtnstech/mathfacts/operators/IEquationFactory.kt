package com.mtnstech.mathfacts.operators

interface IEquationFactory {
    fun generateEquation(maxNumber: Int, practiceNumber: Int? = null): Equation
}