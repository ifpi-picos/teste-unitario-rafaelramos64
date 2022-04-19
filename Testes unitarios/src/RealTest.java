import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RealTest {

	@Test
	public void testMultiplication() {
       Real five = new Real(5);
       five.times(2);
       assertEquals(10, five.amount);
	}
	
}
