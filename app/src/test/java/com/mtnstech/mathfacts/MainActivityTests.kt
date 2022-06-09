package com.mtnstech.mathfacts

import com.mtnstech.mathfacts.ViewModels.MainActivityViewModel
import com.mtnstech.mathfacts.operators.AdditionEquationFactory
import com.mtnstech.mathfacts.operators.Equation
import com.mtnstech.mathfacts.operators.Operation
import com.mtnstech.mathfacts.operators.Status
import org.junit.Assert
import org.junit.Test

class MainActivityTests {

    @Test
    fun setFactoryType_Subtraction() {
        val vm = MainActivityViewModel()
        vm.setOperation(Operation.SUBTRACTION)
        Assert.assertEquals(vm.getEquationFactory(), Operation.SUBTRACTION.factory)
    }

    @Test
    fun setStatus_InProgress() {
        val vm = MainActivityViewModel()
        vm.setStatus(Status.IN_PROGRESS)
        Assert.assertEquals(vm.getStatus(), Status.IN_PROGRESS)
    }

    @Test
    fun skipEquation(){
        val vm = MainActivityViewModel()
        vm.setOperation(Operation.ADDITION)
        val equation = vm.skipEquation()
        Assert.assertTrue(equation is Equation)
    }

    @Test
    fun answerEquation(){
        val vm = MainActivityViewModel()
        vm.setOperation(Operation.ADDITION)
        val equation = vm.answerEquation(2)
        Assert.assertTrue(equation is Equation)
    }

    @Test
    fun skipEquation_AddToList(){
        val vm = MainActivityViewModel()
        vm.setOperation(Operation.ADDITION)
        vm.skipEquation()
        vm.skipEquation()
        Assert.assertTrue(vm.getEquationList().count() == 2)
    }

    @Test
    fun answerEquation_AddToList(){
        val vm = MainActivityViewModel()
        vm.setOperation(Operation.ADDITION)
        vm.answerEquation(2)
        vm.answerEquation(2)
        Assert.assertTrue(vm.getEquationList().count() == 2)
    }
}