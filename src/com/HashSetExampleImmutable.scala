package com;

object HashSetExampleImmutable {

  import scala.collection.immutable.HashSet
  import scala.collection.mutable.Map
  def main(args: Array[String]) {
  val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")


 val treasureMap = Map[Int, String]()
//  treasureMap += (1 -> "Go to island.")
//    treasureMap += (1.->("Go to island."))
    treasureMap += ((1).->("Go to island."))
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))
  
  
  }
  
  def formatArgs(args: Array[String]) = args.mkString("\n")
}