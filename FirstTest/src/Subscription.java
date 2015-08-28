public class Subscription {

   private int price ; // subscription total price in cents
   private int length ; // length of subscription in months

   // constructor :
   public Subscription(int p, int n) {
     price = p ;
     length = n ;
   }

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

/**
   * Calculate the monthly subscription price in dollars,
   * rounded up to the nearest cent.
   */
   public double pricePerMonth() {
     double r = (double) price / (double) length ;
      return r ;
   }

  /**
   * Call this to cancel/nulify this subscription.
   */
   public void cancel() { length = 0 ; }

}