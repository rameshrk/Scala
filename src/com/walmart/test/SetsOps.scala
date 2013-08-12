package com.walmart.test
import scala.collection.mutable

object SetsOps {

  def main(args: Array[String]): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    println(jetSet)
    jetSet += "Lear"
    println(jetSet)
    println(jetSet.contains("Cessna"))

val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
  movieSet += "Shrek"
  println(movieSet)


  }
}