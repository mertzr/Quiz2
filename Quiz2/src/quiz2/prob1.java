package quiz2;


public class prob1 {
	
	private double payment;
	/*p-d(r/12)/(1-(1+r/12)^-l)
	 * 
	 */
	
	public double monthlyPayment(double carCost, double interestRate,double downPayment, int monthsOfLoan) {
		payment=((carCost-downPayment)*(interestRate/12))/(1-(Math.pow((1+(interestRate/12)),(-1*monthsOfLoan))));
		return payment;
	}
	public double spentOnInterest(double payment, double downPayment, int monthsOfLoan, double carCost) {
		return (payment*monthsOfLoan)+downPayment-carCost;
		
	}
		
}


