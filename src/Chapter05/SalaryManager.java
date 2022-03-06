package Chapter05;

public class SalaryManager {
	public double getMonthSalary(int yearlySalary) {
		double monthSalary = yearlySalary / 12.0;
		System.out.println("Month Salary original is " + monthSalary);
		double incomeTax = calculateIncomeTax(monthSalary);
		System.out.println("my tax is " + incomeTax);
		double nationalPension = calculateNationalPension(monthSalary);
		System.out.println("my nationalPension is " + nationalPension);
		double healthInsurance = calculateHealthInsurance(monthSalary);
		System.out.println("my healthInsurance is " + healthInsurance);

		double totalTax = incomeTax + nationalPension + healthInsurance;
		monthSalary -= totalTax;
		return monthSalary;

	}

	public double calculateIncomeTax(double monthSalary) {
		double incomeTax = monthSalary * 12.5 / 100;
		return incomeTax;
	}

	public double calculateNationalPension(double monthSalary) {
		double nationalPension = monthSalary * 8.1 / 100;
		return nationalPension;
	}

	public double calculateHealthInsurance(double monthSalary) {
		double healthInsurance = monthSalary * 13.5 / 100;
		return healthInsurance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryManager sal = new SalaryManager();
		System.out.println("The net income is " + sal.getMonthSalary(20000000));
	}

}
