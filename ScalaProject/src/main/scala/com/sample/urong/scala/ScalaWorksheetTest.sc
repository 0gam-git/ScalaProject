package com.sample.urong.scala

object ScalaWorksheetTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val list = List(1, 2, 3, 4, 5)                  //> list  : List[Int] = List(1, 2, 3, 4, 5)
  list.foldRight(5)((result, i) => result + i)    //> res0: Int = 20
  list.foldLeft(1)((result, i) => result + i)     //> res1: Int = 16
}