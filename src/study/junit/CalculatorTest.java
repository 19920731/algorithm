package study.junit;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		 
        int resultSum = calculator.sum(5, 5);
        System.out.println("resultSum : " + resultSum);        
	}
	
	@Test
	public void testSub() {
		Calculator calculator = new Calculator();
		
        int resultSub = calculator.sub(5, 5);
        System.out.println("resultSub : " + resultSub);        
	}
	
	@Test
	public void testMul() {
		Calculator calculator = new Calculator();
		
        int resultMul = calculator.mul(5, 5);
        System.out.println("resultMul : " + resultMul);        
	}
	
	@Test
	public void testDiv() {
		Calculator calculator = new Calculator();
		
        int resultDiv = calculator.div(5, 5);
        System.out.println("resultDiv : " + resultDiv);        
	}
}
