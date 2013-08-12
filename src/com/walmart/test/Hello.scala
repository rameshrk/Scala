package com.walmart.test
object Hello {

  def main(args: Array[String]): Unit = {
    println("Hello, world, from a script!")
    println("Hello, " + args(0) + "!")
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }
}