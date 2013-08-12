object worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
def increase(i: Int) = i + 1                      //> increase: (i: Int)Int
increase(8)                                       //> res0: Int = 9
val hello = "hello"                               //> hello  : java.lang.String = hello
println("""Welcome to Ultamix 3000.
             Type "HELP" for help.""")            //> Welcome to Ultamix 3000.
                                                  //|              Type "HELP" for help.
println("""|Welcome to Ultamix 3000.
             |Type "HELP" for help.""".stripMargin)
                                                  //> Welcome to Ultamix 3000.
                                                  //| Type "HELP" for help.

val s = 'aSymbol                                  //> s  : Symbol = 'aSymbol
s.name                                            //> res1: String = aSymbol
val bool = true                                   //> bool  : Boolean = true

val fool = false                                  //> fool  : Boolean = false
(1).+(2)                                          //> res2: Int(3) = 3
(3).*(6)                                          //> res3: Int(18) = 18

def f(): Unit = "this String gets lost"           //> f: ()Unit
def g() { "this String gets lost too" }           //> g: ()Unit
def h() = { "this String gets returned!" }        //> h: ()java.lang.String
 val longSum = 1 + 2L                             //> longSum  : Long = 3
 val s1 = "Hello, world!"                         //> s1  : java.lang.String = Hello, world!
 s1.indexOf('o')                                  //> res4: Int = 4
s1 indexOf 'o'                                    //> res5: Int = 4
s1 indexOf 'o'                                    //> res6: Int = 4
s1 indexOf ('o', 5)                               //> res7: Int = 8
(2.0).unary_-                                     //> res8: Double = -2.0
2.0.unary_-                                       //> res9: Double = -2.0
-(2.0)                                            //> res10: Double = -2.0
-(2)                                              //> res11: Int = -2


1.2 + 2.3                                         //> res12: Double(3.5) = 3.5
3 - 1                                             //> res13: Int(2) = 2
2L * 3L                                           //> res14: Long(6L) = 6

1 > 2                                             //> res15: Boolean(false) = false
1.0 <= 1.0                                        //> res16: Boolean(true) = true
3.5f >= 3.6f                                      //> res17: Boolean(false) = false
'a' >= 'A'                                        //> res18: Boolean(true) = true

1.0.unary_+                                       //> res19: Double = 1.0

def salt() = { println("salt"); false }           //> salt: ()Boolean
def pepper() = { println("pepper"); true }        //> pepper: ()Boolean


pepper() || salt()                                //> pepper
                                                  //| res20: Boolean = true
//("he"+"llo") == "hello"
class Rational(n: Int, d: Int) {
    println("Created "+ n +"/"+ d)
}
}