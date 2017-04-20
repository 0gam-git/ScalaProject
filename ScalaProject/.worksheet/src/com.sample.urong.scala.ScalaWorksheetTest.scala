package com.sample.urong.scala

object ScalaWorksheetTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 
  println("Welcome to the Scala worksheet");$skip(33); 
  val list = List(1, 2, 3, 4, 5);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(47); val res$0 = 
  list.foldRight(5)((result, i) => result + i);System.out.println("""res0: Int = """ + $show(res$0));$skip(46); val res$1 = 
  list.foldLeft(1)((result, i) => result + i);System.out.println("""res1: Int = """ + $show(res$1))}
}
