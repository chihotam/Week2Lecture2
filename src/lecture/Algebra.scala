package lecture

import util.control.Breaks._

object Algebra {
  def isPrime(input: Int): Boolean = {
    for (i <- 2 to input-1){
      if (input % i == 0){
        return false
      }
    }
    true
  }
  def factor(input: Int): List[Int] = {
    var lis: List[Int] = List()
    if (input <= 0){
      lis = List()
    }
    else if (input == 1){
      lis = lis :+ 1
    }
    else if (isPrime(input)){
      lis = lis :+ input
    }
    else{
      var x: Int = input
      while(!isPrime(x)){
        breakable{
          for (i <- 2 to x-1) {
            if (x % i == 0) {
              lis = lis :+ i
              x = x / i
              println(i)
              println(x)
              break
            }
          }
        }
      }
      lis = lis :+ x
    }
    lis
  }
}
