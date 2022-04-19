import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RealTest {

	@Test
	public void testMultiplication() {
		Real five = new Real(5);
		
		assertEquals(new Real(10), five.times(2));
		assertEquals(new Real(15), five.times(3));
	}
}
