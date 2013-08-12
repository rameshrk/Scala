package com;

class RationalAdd(n: Int, d: Int) {
  require(d != 0)
  //  private val g =1
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  override def toString = numer + "/" + denom

  def add(that: RationalAdd): RationalAdd =
    new RationalAdd(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def max(that: RationalAdd) =
    if (this.lessThan(that)) that else this

  def lessThan(that: RationalAdd) =
    numer * that.denom < that.numer * this.denom
  //          this.numer * that.denom < that.numer * this.denom

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def +(i: Int): RationalAdd =
    new RationalAdd(numer + i * denom, denom)
  def -(i: Int): RationalAdd =
    new RationalAdd(numer - i * denom, denom)

  def *(that: RationalAdd): RationalAdd =
    new RationalAdd(numer * that.numer, denom * that.denom)
  def *(i: Int): RationalAdd =
    new RationalAdd(numer * i, denom)
  def /(that: RationalAdd): RationalAdd =
    new RationalAdd(numer * that.denom, denom * that.numer)
  def /(i: Int): RationalAdd =
    new RationalAdd(numer, denom * i)

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  val filesHere = (new java.io.File(".")).listFiles

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) =
    for (
      file <- filesHere if file.getName.endsWith("e");
      line <- fileLines(file) if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)

  grep(".*gcd.*")
  grep(".*")

}

object RationalAdd //extends Application
{
  println(new RationalAdd(1, 2))
  println(new RationalAdd(1, 2).add(new RationalAdd(1, 2)))
  println(new RationalAdd(1, 2) add (new RationalAdd(1, 1)))
  println(new RationalAdd(1, 2) lessThan (new RationalAdd(1, 2)))
  println(new RationalAdd(1, 9) max (new RationalAdd(1, 1)))
  println(new RationalAdd(1, 9) * (new RationalAdd(1, 1)))
  println(new RationalAdd(1, 9).*(new RationalAdd(1, 1)))

  def main(args: Array[String]) {
    val filename =
      if (!args.isEmpty) args(0)
      else "default.txt"

    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere)
      println(file)

    val filesScalaHere = (new java.io.File(".")).listFiles
    for (file <- filesHere if file.getName.endsWith("e"))
      println("*" + file)

  }
}

