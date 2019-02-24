
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin.seewer
 */
public class StringCalculatorTest {
    @Before
  public void setup(){
  }
    
    @Test
	public void testEmptyString() {
            StringCalculator Calculator = new StringCalculator();
		assertEquals(0, Calculator.add(""));
}
        
    @Test    
     public void test1Valeure() {
            StringCalculator Calculator = new StringCalculator();
		assertEquals(2, Calculator.add("2"));
    
}   
        
    @Test    
        public void test2Valeursavecvirgule() {
            StringCalculator Calculator = new StringCalculator();
		assertEquals(5, Calculator.add("2,3"));
    
}
        @Test    
        public void test3Valeursavecvirgule() {
            StringCalculator Calculator = new StringCalculator();
		assertEquals(8, Calculator.add("2,3,3"));
    
}
        
      @Test
    public void test1Ligne(){
         StringCalculator Calculator = new StringCalculator();
    	assertEquals(6, Calculator.add("1\n2,3"));
        
    }
  
        
}