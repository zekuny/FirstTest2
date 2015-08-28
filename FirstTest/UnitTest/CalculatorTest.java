import org.junit.* ;
import static org.junit.Assert.* ;

public class CalculatorTest {

   @Test
   public void substraction_helper() {
      System.out.println("Test if the substraction return correct result...") ;
      Calculator C = new Calculator() ;
      assertEquals(C.substraction(10, 10), 0, 0) ;
   }
   
   @Test
   public void calculate_helper() {
      System.out.println("Test if the calculate return correct result...") ;
      Calculator C = new Calculator() ;
      assertEquals(C.calculate(100, '/', 10), 10, 0) ;
   }

}