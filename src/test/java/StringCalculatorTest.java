
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
    StringCalculator Calculator = new StringCalculator();
    
    @Test
	public void testEmptyString() {
            
		assertEquals(0, Calculator.add(""));
}
        
    @Test    
     public void test1Valeure() {
            
		assertEquals(2, Calculator.add("2"));
    
}   
        
    @Test    
        public void test2Valeursavecvirgule() {
           
		assertEquals(5, Calculator.add("2,3"));
    
}
        @Test    
        public void test3Valeursavecvirgule() {
           
		assertEquals(8, Calculator.add("2,3,3"));
    
}
        
      @Test
    public void test1Ligne(){
        
    	assertEquals(6, Calculator.add("1\n2,3"));
        
    }
  
      @Test
    public void testPlusGrandMille(){
      
    	assertEquals(50, Calculator.add("1000,50"));
}
    
     @Test
    public void testOtherDelimiter(){
        
    	assertEquals(3, Calculator.add("//;\n1;2"));
}
    
    
      @Test
    public void testNegatif(){
    	try {
			Calculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Les négatifs ne sont pas acceptés: -1");
		}

		try {
			Calculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Les négatifs ne sont pas acceptés: -4,-5");
		}
}
     public void testmultipleDelimiteur(){
        
    	assertEquals(6, Calculator.add("//[*]\\n1**2**3"));
}
  
}