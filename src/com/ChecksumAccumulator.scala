package com;

import scala.collection.mutable.Map
object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s)) {
      cache(s)
    } else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }

  def main(args: Array[String]) {
    //   calculate("abc")
    println(calculate("abc"))
    println(calculate("abc"))
    ChecksumAccumulator.calculate("abc")

  }

}

class ChecksumAccumulator {
  private var sum = 0
  //  def add(b: Byte): Unit = sum += b
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}
