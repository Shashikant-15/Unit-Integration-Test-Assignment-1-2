package DivideFibonacci

import scala.collection.mutable.ListBuffer

class Fibonacci_Divide extends Divide  {

  @Override
   def divide (divisor: Int, dividend: Int): Int = divisor / dividend

  @Override
   def fibonacci(Total_Terms: Int): ListBuffer[Int] = {

    if (Total_Terms < 0) throw new IllegalArgumentException("Negative number of Terms are not Allowed in Fibonacci Series")

    var first_term: Int = 0
    var second_term: Int = 1
    var sum: Int = 0
    val Fibonacci_Series = new ListBuffer[Int]
    if (Total_Terms == 1) return Fibonacci_Series += first_term

    Fibonacci_Series += (first_term, second_term)
    if (Total_Terms == 2) return Fibonacci_Series
    for (_ <- 3 to Total_Terms) {

      sum = first_term + second_term
      Fibonacci_Series.append(sum)
      first_term = second_term
      second_term = sum
    }

    Fibonacci_Series
  }


}

















