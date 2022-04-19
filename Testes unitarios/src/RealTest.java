import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RealTest {

	@Test
	public void TestMultiplication() {
	   Money five = Money.real(5);
	   
	   assertEquals(Money.real(10), five.times(2));
	   assertEquals(Money.real(15), five.times(3));
	}
}
