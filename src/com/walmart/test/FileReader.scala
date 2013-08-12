package com.walmart.test;
import scala.io.Source

object FileReader {

	  def main(args: Array[String]): Unit = {
		  if (args.length > 0) {
		    for (line <- Source.fromFile(args(0)).getLines())
		      {
//		      println(line.length +" "+ line)
//		      Console println line.getClass()
		      val lines = Source.fromFile(args(0)).getLines().toList
		      }
		}
		else
		    Console.err.println("Please enter filename")
	}
}

