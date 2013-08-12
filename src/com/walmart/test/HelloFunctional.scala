package com.walmart.test
object HelloFunctional {

  def main(args: Array[String]): Unit = {
    args.foreach((arg: String) => println(arg))
    args.foreach((argd: String) => println(argd))
    for (arg <- args)
    println(arg)
     args.foreach(println)
    }
}