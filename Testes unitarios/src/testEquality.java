import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEquality {

	@Test
	public void testEquality() {
	   assertTrue(new Real(5).equals(new Real(5)));
	   assertFalse(new Real(5).equals(new Real(6)));
	   assertTrue(new Franc(5).equals(new Franc(5)));
	   assertFalse(new Franc(5).equals(new Franc(6)));
	}

}
