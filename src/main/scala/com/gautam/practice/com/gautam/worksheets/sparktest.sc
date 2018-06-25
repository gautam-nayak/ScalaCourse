
//Higher order functions i.e function that takes a function

def sum(f: Int => Int): (Int, Int) => Float = {

  def sumReturns2(a: Int, b: Int): Float = {

    f(a) + f(b)
  }

  sumReturns2
}

def sum1(f: Int => Float)(a: Int, b: Int): Float = f(a) + f(b)

def square(x: Int): Int = x * x

def cube(x: Int): Int = x * x * x

sum(square)(2, 2)

sum(cube)(2, 2)


sum1(square)(2, 2)
sum1(cube)(2, 2)

def func(a: Int)(b: Int): Int = a + b

val partialResult = func(3) _

partialResult(2)

val div: PartialFunction[(Double, Double), Double] = {
  case (x, y) if y != 0 => x / y
}

div.isDefinedAt(2, 0)


object add extends Function2[Int, Int, Int] {
  override def apply(v1: Int, v2: Int) = v1 + v2
}

add(2, 3)

val add1 = (a: Int, b: Int) => a + b


object inc extends Function1[Int, Int] {
  override def apply(v1: Int) = {

    add1(v1, 5)
  }

}

inc(5)


def division: (Int, Int) => Int = {

  case (x, y) if y != 0 => x / y
}


val mults =(a:Int,b:Int) => a*b

mults(2,3)

val neg : Int =>Int = - _

val getNeg :Int => Int = {

  neg(_)

}

val isEven:Int => Boolean = _ %2 ==0

isEven(8993   ) +" < - the answer"

val mults1 :(Int,Int) => Int = {

  case (a,b) => a*b
}


mults1(2,3)


val ExpMul : (Int,Int) => Int = (x,y) => x * y

ExpMul(2,4)

def types[T <: AnyRef](a:T)  = {

  Seq(a)
}

def types1[T >: Any] (a:T) = {

  Seq(a)
}

types(List)

types(Seq((1.0,2.0),("hello",5)))
types(Seq((1.0,2.0),(2,5)))

types(Seq((1.0,2.0),("hello",5)))
  .flatMap(x => x)

types(Seq((1.0,2.0),("hello",5))).flatMap(x => x).map(x => x._1)
types(Seq((1.0,2.0),(2,5))).flatMap(x => x).map(x => x._1)
//.flatMap(x => x).map(x => x._1)

Map(1 -> 100,2 -> 200 , 3 -> 300).map(x => x._1)

val input  = "hello"

def funcs[T](s:String)(name: String => T)={

  name(s)

}

funcs(input)(x => x.contains("lo"))




