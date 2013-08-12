package com;

class Rational(n: Int, d: Int) {
  require(d != 0)
  override def toString = n + "/" + d
  def main(args: Array[String]) {
    println(new Rational(1, 2))

  }
  def addTwice(that: Rational): Rational =
    new Rational(n * d + n * d, d * d)
}

object Rational extends Application {
  println(new Rational(1, 2))
  new Rational(1, 2).addTwice(new Rational(1, 2))
  new Rational(1, 2) addTwice (new Rational(1, 2))
}

object Rational2 {
  println(new Rational(1, 2))
  def main(args: Array[String]) {
    println(new Rational(1, 2))
    println(new Rational(1, 2) addTwice (new Rational(1, 2)))
    println(new Rational(1, 2).addTwice(new Rational(1, 2)))
    new Rational(2, 3).main(args)
  }

}
