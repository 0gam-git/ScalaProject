package com.sample.urong.scala

object ScalaStarter {
  // this function trying to receive multiply parameter.
  def multiply(m: Int)(n: Int): Int = {
    m * n;
  }

  // this curried, that use "_" word in curried function. this "_" is one parameter role.
  def curried() {
    val timesTwo = multiply(2) _;

    timesTwo(3)
  }

  //  variable Length -> String
  def capitalizeAll(args: String*) = {
    args.map { arg =>
      arg.capitalize
    }
  }

  def capitalizeAllResult() {
    capitalizeAll("rarity", "applejack");
    capitalizeAll("rarity", "applejack", "box", "cup");
  }
}