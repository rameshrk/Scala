package com.walmart.test

// Working
//class Rational(n: Int, d: Int) {
//  require(d != 0)
//    println("Created "+ n +"/"+ d)
//     override def toString = n +"/"+ d
//}

// Not Working
// class Rational(n: Int, d: Int) { // This won’t compile
//          require(d != 0)
//          override def toString = n +"/"+ d
//          def add(that: Rational): Rational =
//            new Rational(this.n * that.d + that.n * d, d * that.d)
//        }

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer + "/" + denom

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

def this(n: Int) = this(n, 1)
  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom
 def max(that: Rational) =
          if (this.lessThan(that)) that else this

}

object RationalObject {
  def main(args: Array[String]) {

    val x = new Rational(1, 3)
    val x2 = new Rational(1, 8)
    //	      val x1 = new Rational(1, 0)
    println(x)
    println(x2)
    val oneHalf = new Rational(1, 2)
    println(oneHalf.denom)
    println(oneHalf.numer)
    val twoThirds = new Rational(2, 3)
    println(oneHalf add twoThirds)

   println( oneHalf lessThan twoThirds)
   println( oneHalf max twoThirds)


  }
}
