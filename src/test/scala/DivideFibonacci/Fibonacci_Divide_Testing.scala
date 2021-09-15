package DivideFibonacci

import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ListBuffer

class Fibonacci_Divide_Testing extends AnyFunSuite {

  val obj = new Fibonacci_Divide

  test("Divide two numbers, where Dividend=6 and Divisor= 2") {
    val expectedOutcome = 3
    val outcome = obj.divide(6,2)
    assert(expectedOutcome == outcome)
  }

  test("Dividing a Number by 0 throws Arithmetic Exception") {
    assertThrows[ArithmeticException] {
      obj.divide(50, 0)
    }
  }

  test("Return a Fibonacci Series if the Number of Terms 9"){
    val expectedOutcome = new ListBuffer[Int]
    expectedOutcome += (0,1,1,2,3,5,8,13,21)
    val outcome = obj.fibonacci(9)
    assert(expectedOutcome == outcome)
  }

  test("No. of Terms in a Fibonacci Series if given Negative throws IllegalArgument Exception"){
    intercept[IllegalArgumentException]{
      obj.fibonacci(-11)
    }
  }

}