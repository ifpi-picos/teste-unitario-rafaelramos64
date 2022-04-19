
public class Real extends Money {
	private int amount;
	private String currency;
	
	Real(int amount, String currency)  {
		super(amount, currency);
   }
	
   Money times(int multiplier)  {
      return Money.real(amount * multiplier);
   }
	
	public boolean equals(Object object)  {
		Real real = (Real) object;
		return amount == real.amount;
	}
}