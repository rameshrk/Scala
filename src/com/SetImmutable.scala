package com;

object SetExampleImmutable {

  import scala.collection.immutable.Set
  def main(args: Array[String]) {
    var movieSet = Set("Hitch", "Poltergeist")
    movieSet = movieSet+"Shrek"
//    movieSet += "Shrek"
    println(movieSet)

  }
}