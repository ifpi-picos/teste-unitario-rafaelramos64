		import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Currency {

	@Test
	void testCurrency() {
		 assertEquals("USD", Money.real(1).currency());
		 assertEquals("CHF", Money.franc(1).currency());
	}

}
