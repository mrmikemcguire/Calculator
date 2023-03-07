import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
	{
		@Test
		public void testAdd()
			{
				assertEquals(5, Calculator.add(2, 3));
				fail("Not yet implemented");
			}

		@Test
		public void testSubtract()
			{
				assertEquals(2, Calculator.subtract(5, 3));
				fail("Not yet implemented");
			}

		@Test
		public void testMultiply()
			{
				assertEquals(6, Calculator.multiply(2, 3));
				fail("Not yet implemented");
			}

		@Test
		public void testDivide()
			{
				assertEquals(4, Calculator.add(20, 5));
				fail("Not yet implemented");
			}

	}
