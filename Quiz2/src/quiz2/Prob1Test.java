package quiz2;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;

import org.junit.Test;

class Prob1Test {

	public void prob1Test() throws Exception{
		prob1 test=new prob1();
		assertEquals(test.monthlyPayment(30000.00,.045,5000.00,36),743.67);
		assertEquals(test.spentOnInterest(743.67,5000.00,36,30000.00),1772.23);
	}

}
