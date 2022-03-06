package Chapter06;

public class InterestManager {
	public static void main(String[] args) {
		InterestManager im = new InterestManager();
//		for (int day = 1; day <= 365; day++) {
//			double finalAmount = im.calculatedAmount(day, 1000000);
//			System.out.println(day + ":" + finalAmount);
//		}

		for (int day = 1; day <= 370; day += 10) {
			double finalAmount = im.calculatedAmount(day, 1000000);
			System.out.println(day + ":" + finalAmount);
		}

	}

	public double getInterestRate(int day) {
		double interestRate = 0;
		if (day >= 1 && day <= 90) {
			interestRate = 0.5;
		} else if (day >= 91 && day <= 180) {
			interestRate = 1;
		} else if (day >= 181 && day <= 364) {
			interestRate = 2;
		} else {
			interestRate = 5.6;
		}

		return interestRate;
	}

	public double calculatedAmount(int day, long amount) {
		double totalAmount;
		double interest;
		interest = getInterestRate(day);
		double interestAmount = amount * interest / 100.0;
		totalAmount = interestAmount + amount;
		return totalAmount;
	}
}
