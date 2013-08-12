package com.walmart.test


class Rationalv3(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1)
  def + (that: Rationalv3): Rationalv3 =
    new Rationalv3(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def + (i: Int): Rationalv3 =
    new Rationalv3(numer + i * denom, denom)
  def - (that: Rationalv3): Rationalv3 =
    new Rationalv3(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  def - (i: Int): Rationalv3 =
    new Rationalv3(numer - i * denom, denom)
  def * (that: Rationalv3): Rationalv3 =
    new Rationalv3(numer * that.numer, denom * that.denom)
  def * (i: Int): Rationalv3 =
    new Rationalv3(numer * i, denom)
  def / (that: Rationalv3): Rationalv3 =
    new Rationalv3(numer * that.denom, denom * that.numer)
  def / (i: Int): Rationalv3 =
    new Rationalv3(numer, denom * i)
  override def toString = numer +"/"+ denom
private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
object RationalObjectv3 {
  def main(args: Array[String]) {


val x = new Rationalv3(2, 3)
println(x * x)
println(x * 2)


  }
}