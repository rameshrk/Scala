package com.walmart.test


class Rationalv2(n: Int, d: Int) {
    require(d != 0)
    private val g = gcd(n.abs, d.abs)
    val numer = n / g
    val denom = d / g
    def this(n: Int) = this(n, 1)
    def + (that: Rationalv2): Rationalv2 =
      new Rationalv2(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )
    def * (that: Rationalv2): Rationalv2 =
      new Rationalv2(numer * that.numer, denom * that.denom)
    override def toString = numer +"/"+ denom
private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object RationalObjectv2 {
  def main(args: Array[String]) {


val x = new Rationalv2(1, 2)
val y = new Rationalv2(2, 3)
println(x + y)
println(x.+(y))

  }
}