package com.cousera

object and  {
  def and(x: Boolean, y: =>Boolean)= {
	  if(x) y else false
  }

  import or.loop
//   def main(args: Array[String]): Unit = {
//  	  def main(args: Array[String]) ={
  	  def main(args: Array[String]) {
   println(and(true,true))
   println(and(true,false))
   println(and(false,false))
   println(and(false,true))
   println(and(false,loop))


  }


}