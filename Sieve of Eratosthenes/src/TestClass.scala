import org.junit.Test
import junit.framework.Assert

class TestClass {
  
  @Test
  def testDeterminePrimeNumbers(){
    
    Assert.assertEquals(List(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47),
        MainObject.determinePrimeNumbers(List.range(1, 50 + 1), 50, 2) )
        
    Assert.assertEquals(List(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97),
        MainObject.determinePrimeNumbers(List.range(1, 100 + 1), 100, 2))

  }
}