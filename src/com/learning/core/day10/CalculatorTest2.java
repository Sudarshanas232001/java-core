package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.learning.core.day10.Calculator2;

public class CalculatorTest2 {
	  @Test
	    public void testMul() {
	        Calculator2 calculator = new Calculator2();
	        int a = 2;
	        int b = 3;
	        int ans = a * b;
	        assertEquals(ans, calculator.mul(a, b));
	        assertEquals(-2, calculator.mul(-2, 1));
	        assertEquals(0, calculator.mul(0, 1));
	        assertEquals(2500, calculator.mul(50, 50));
	    }
	    
	    @Test
	    public void testDiv() {
	        Calculator2 calculator = new Calculator2();
	        assertEquals(3, calculator.div(9, 3));
	        assertEquals(0, calculator.div(0, 3));
	        assertEquals(2, calculator.div(10, 5));
	        assertEquals(1, calculator.div(100, 100));
	    }
	}
