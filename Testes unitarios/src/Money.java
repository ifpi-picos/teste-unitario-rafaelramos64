abstract class Money  {
   protected int amount;
   private String currency;
   
   abstract Money times(int multiplier);
   
   String currency() {
      return currency;
   }

   static Money real(int amount)  {
      return new Real(amount, "BRL");
   }

   static Money franc(int amount) {
      return new Franc(amount, "CHF");
   }

   Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
   
   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }
}