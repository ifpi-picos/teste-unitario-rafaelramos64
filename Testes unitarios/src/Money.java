abstract class Money  {
   protected int amount;
   
   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }
   
   static Real real(int amount)  {
      return new Real(amount);
   }
   
   static Money franc(int amount) {
      return new Franc(amount);
    }
	
   abstract Money times(int multiplier);
}