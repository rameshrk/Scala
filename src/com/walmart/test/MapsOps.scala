package com.walmart.test
import scala.collection.mutable

object MapsOps {

  def main(args: Array[String]): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    println(jetSet)
    jetSet += "Lear"
    println(jetSet)
    println(jetSet.contains("Cessna"))

val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
  movieSet += "Shrek"
  println(movieSet)

val treasureMap = scala.collection.mutable.Map[Int, String]()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))


    val romanNumeral = Map(
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
  )
  println(romanNumeral(4))
  }
}