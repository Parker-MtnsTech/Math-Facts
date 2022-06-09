package com.mtnstech.mathfacts.ViewModels

import androidx.lifecycle.ViewModel
import com.mtnstech.mathfacts.operators.*

class MainActivityViewModel : ViewModel() {

    private var operation: Operation = Operation.ADDITION
    private var status = Status.HOME
    private var maxEquationNumber: Int = 12
    private var currentEquation: Equation = operation.factory.generateEquation(maxEquationNumber)
    private var answeredEquations: MutableList<Equation> = mutableListOf()

    fun setOperation(operation: Operation) {
        this.operation = operation
        currentEquation = operation.factory.generateEquation(maxEquationNumber)
    }
    fun getEquationFactory() = operation.factory

    fun setStatus(status: Status) { this.status = status }
    fun getStatus() = status

    fun setMaxEquationNumber(maxNumber: Int) { maxEquationNumber  = maxNumber }
    fun getMaxEquationNumber()  = maxEquationNumber

    fun getEquationList() = answeredEquations
    fun getCurrentEquation() = currentEquation

    fun answerEquation(answer: Int): Equation {
        currentEquation.submitAnswer(answer)
       return recordEquationAndGetNext()
    }

    fun skipEquation(): Equation {
        return recordEquationAndGetNext()
    }

    private fun recordEquationAndGetNext(): Equation {
        answeredEquations.add(currentEquation)

        currentEquation = operation.factory.generateEquation(maxEquationNumber)

        return currentEquation
    }
}