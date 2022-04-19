import static org.junit.Assert.*;

import org.junit.Test;


public class DollarTest {
	
	@Test
	public void teste() {
		Dollar dollar = new Dollar();
		
		int dollarToday = 6;
		
		int resultado = dollar.somar(2, 3);
		
		assertTrue(resultado == dollarToday); 
	}
}

