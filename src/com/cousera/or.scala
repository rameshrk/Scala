package com.cousera

object or  {
  def or(x: Boolean, y: => Boolean)= {
	  if(x) true else y
  }

   def main(args: Array[String]): Unit = {
   println(or(true,true))
   println(or(true,false))
   println(or(false,false))
   println(or(false,true))
   println(or(true,loop))




  }

def loop: Boolean  = loop
}