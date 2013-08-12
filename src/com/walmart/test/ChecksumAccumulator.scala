package com.walmart.test;
import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = {
    //    b=1;
    sum += b
  }
  def checksum(): Int = {
    return ~(sum) + 1
    //    		 ~(sum & 0xFF) + 1
  }
  def g() { "this String gets lost too" }
  def f(): Unit = "this String gets lost"
  def h() = { "this String gets returned!" }

}

object ChecksumAccumulatorObject {
  def main(args: Array[String]): Unit = {
    val cs = new ChecksumAccumulator
    println(cs.g())
    println(cs.f())
    println(cs.h())
    println(ChecksumAccumulatorObject.calculate("a"));
    println(ChecksumAccumulatorObject.calculate("b"));
    println(ChecksumAccumulatorObject.calculate("c"));
     Console println  (ChecksumAccumulatorObject.calculate("d"));

  }


  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}
