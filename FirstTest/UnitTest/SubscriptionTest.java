import org.junit.* ;
import static org.junit.Assert.* ;

public class SubscriptionTest {

   @Test
   public void test_returnDollar() {
      System.out.println("Test if pricePerMonth returns Dollars...") ;
      Subscription S = new Subscription(200,2) ;
      assertTrue(S.pricePerMonth() == 100) ;
   }

   @Test
   public void test_roundUp() {
      System.out.println("Test if pricePerMonth rounds up correctly...") ;
      Subscription S = new Subscription(200,3) ;
      assertEquals(S.pricePerMonth(), 200.0 / 3, 0.00001) ;
   }
}