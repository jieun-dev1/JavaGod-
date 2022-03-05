
public class Ch1Calculator {

	// TODO Auto-generated method stub
	public int add(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}

	public int subtract(int num1, int num2) {
		int difference;
		if (num1 > num2) {
			difference = num2 - num1;
		} else {
			difference = num1 - num2;
		}
		return difference;
	}

	public int multiply(int num1, int num2) {
		int multiply;
		multiply = num1 * num2;
		return multiply;
	}

	public int divide(int num1, int num2) {
		int divide;
		divide = num1 / num2;
		return divide;
	}

}
