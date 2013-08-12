package com.walmart.test
object ListOps {

  def main(args: Array[String]): Unit = {
    val oneTwo = List(1, 2)
    var threeFour = List(3, 4).::(100)

//    threeFour = threeFour.::(100)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new list.")

    oneTwoThreeFour.exists(s => s == 1)

    val pair = (99, "Luftballons", 90)
    println(pair._1)
    println(pair._2)
    println(pair._3)


  }
}