package com.gautam.practice

/**
  * Hello world!
  *
  */
object App extends App {


  def calcSum(f: Int => Float): (Int, Int) => Float = {

    def sum(a: Int, b: Int) = {

      f(a) + f(b)
    }

    sum
  }

  def calcSum1(f: Int => Int)(a: Int, b: Int) = {
    f(a) + f(b)
  }

  def square(x: Int) = x * x

  println(calcSum(square)(2, 3)) //sum of squares
  println(calcSum1(square)(2, 3)) //sum of squares
  print(calcSum(x => x * x * x)(2, 3)) //sum of cubes


}
