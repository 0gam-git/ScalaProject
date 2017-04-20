package com.sample.urong.scala

class ScalaClass {

  def main(args: Array[String]) {
    println("Hello, world!")

  }

  class Inner {

    private def f() {
      println("f")
    }

    class InnerMost {
      f() // OK
    }
  }

}