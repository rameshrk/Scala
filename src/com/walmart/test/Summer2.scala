package com.walmart.test

import ChecksumAccumulatorObject.calculate
object Summer2 extends Application {
  def proxyMain(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + ChecksumAccumulatorObject.calculate(arg))
  }
}