package com;

object SetImmutable {

  import scala.collection.mutable.Set
  def main(args: Array[String]) {
    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    movieSet.+ ("Shrek")
      println(movieSet)

  }
}