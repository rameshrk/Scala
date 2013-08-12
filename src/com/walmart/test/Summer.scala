package com.walmart.test

import ChecksumAccumulatorObject.calculate
object Summer {
    def main(args: Array[String]) {
      for (arg <- args)
        println(arg +": "+ ChecksumAccumulatorObject.calculate(arg))
} }