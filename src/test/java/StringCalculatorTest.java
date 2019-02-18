
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
        public void test2Valeursavecvirgule() {
            StringCalculator Calculator = new StringCalculator();
		assertEquals(3, Calculator.add("1,2"));
    
}
}