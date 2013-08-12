package com.walmart.test
object HelloIteratorFunctional {

  def main(args: Array[String]): Unit = {
//    val greetStrings = new Array[String](3)
    val greetStrings: Array[String] = new Array[String](3)
     val numNames = Array("zero", "one", "two")
//    greetStrings(0) = "Hello"
    greetStrings.update(0, "Hello")
    greetStrings(1) = ", "
    greetStrings(1) = ", ."
    greetStrings(2) = "world!\n"
//    for (i <- 0 to 2)
    	for (i <- (0).to(2))
    	{	println(greetStrings.apply(i))
    	  Console println numNames.apply(i)
      println(greetStrings(i))
    	}
      Console println 10
  }
}