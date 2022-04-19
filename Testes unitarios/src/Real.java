
public class Real extends Money {
	private int amount;
	
	Real(int amount) {
		this.amount = amount;
	}
	
	Money times(int multiplier)  {
      return new Real(amount * multiplier);
    }
	
	public boolean equals(Object object)  {
		Real real = (Real) object;
		return amount == real.amount;
	}
}