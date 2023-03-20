import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
	{
		@Test
		public void testAdd()
			{
			assertEquals(5, Calculator.add(2, 3), 0.01);
			}

		@Test
		public void testSubtract()
			{
			assertEquals(2, Calculator.subtract(5, 3), 0.01);
			}

		@Test
		public void testMultiply()
			{
			assertEquals(6, Calculator.multiply(2, 3), 0.01);
			}

		@Test
		public void testDivide()
			{
			assertEquals(4, Calculator.divide(20, 5), 0.01);
			}
	}
