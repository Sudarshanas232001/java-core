package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.learning.core.day10.Calculator1;

public class CalculatorTest1 {
	@Test
    public void testFindMax() {
        Calculator1 calculator = new Calculator1();
        
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        assertEquals(6, calculator.findMax(arr1));
        
        int[] arr2 = {-1, -2, -3, -4, -5, -6};
        assertEquals(-1, calculator.findMax(arr2));
    }
}
