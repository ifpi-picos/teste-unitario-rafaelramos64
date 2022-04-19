
public class Real {
	private int amount;
	
	Real(int amount) {
		this.amount = amount;
	}
	
	Real times(int multiplier) {
      return new Real(amount * multiplier);
   }
	
	public boolean equals(Object object)  {
		Real real = (Real) object;
	   return amount == real.amount;
	}
}