package com.sample.urong.scala

import com.sample.urong.java.JavaStarter

// this is my first scala program.
// Scala object is singleton. do not need static. this maybe i think to Similar bean in Spring framework.
object ScalaStarter {

  def main(args: Array[String]) {
    println("Hello, world!") // prints Hello World

    var i = multiply(1)(2);
    print(i);

    var java = new JavaStarter();
    java.test();

  }

  // this function trying to receive multiply parameter.
  def multiply(m: Int)(n: Int): Int = {
    m * n;
  }

  // this curried, that use "_" word in curried function. this "_" is one parameter role. so "_" = "*" this is wild card
  def curried() {
    val timesTwo = multiply(2) _;

    timesTwo(3)
  }

  //  variable Length -> String* -> this function control parameter count. 
  def capitalizeAll(args: String*) = {
    args.map { arg =>
      arg.capitalize
    }
  }

  def capitalizeAllResult() {
    capitalizeAll("rarity", "applejack");
    capitalizeAll("rarity", "applejack", "box", "cup");
  }

  // class
  class Calculator {
    val brand: String = "HP"
    def add(m: Int, n: Int): Int = m + n
  }

  val calc = new Calculator

  calc.add(1, 2);

  // constructor
  class Calculator1(brand: String) {
    /**
     * 생성자
     */
    val color: String = if (brand == "TI") {
      "blue"
    } else if (brand == "HP") {
      "black"
    } else {
      "white"
    }

    // 인스턴스 메소드
    def add(m: Int, n: Int): Int = m + n
  }

  val calc1 = new Calculator1("HP")

  // pattern matching
  val times = 1

  times match {
    case 1 => "one"
    case 2 => "two"
    case _ => "some other number"
  }

  times match {
    case i if i == 1 => "one"
    case i if i == 2 => "two"
    case _           => "some other number"
  }

  // String + String = "hi" + "june";
  "My name is ".concat("Zara");

}

