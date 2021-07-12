import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

   Calculator calculator;
   @Before
   public void before() {
      calculator = new Calculator(5.0,2.0);
   }

   @Test
   public void add(){
      assertEquals(7.0,calculator.add(),0.0);
   }

   @Test
   public void subtract(){
      assertEquals(3.0,calculator.subtract(),0.0);
   }

   @Test
   public void multiply(){
      assertEquals(10.0, calculator.multiply(),0.0);
   }

   @Test
   public void divide(){
      assertEquals(2.5,calculator.divide(),0.0);
   }

}
