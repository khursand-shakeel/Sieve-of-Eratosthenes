

object MainObject {
  
  def main(args: Array[String]):Unit= {
   
    println("Please a enter a number: ")
    val n = scala.io.StdIn.readInt()
    val list = List.range(1, n + 1)
    val p = 2
    
    val finalList = determinePrimeNumbers(list, n, p)
    println(finalList)
  }
  
  def determinePrimeNumbers(list:List[Int], n:Int, p:Int) : List[Int] = {
  
    if ((p * p) > n){
     return list 
    }
           
      val newList = list.filter(a => !(a % p == 0 && a != p))
      determinePrimeNumbers(newList, n, p + 1)
     
    } 
}
  
  


