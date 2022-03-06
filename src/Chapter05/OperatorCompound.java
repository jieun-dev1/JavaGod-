package Chapter05;

public class OperatorCompound {
	public void compound() {
		int intValue = 10;
		intValue += 5;
		System.out.println("result is " + intValue);
		intValue -= 5;
		System.out.println("result is " + intValue);
		intValue *= 5;
		System.out.println("result is " + intValue);
		intValue /= 5;
		System.out.println("result is " + intValue);
		intValue %= 5;
		System.out.println("result is " + intValue);

	}

	public static void main(String[] args) {
		OperatorCompound operator = new OperatorCompound();
		operator.compound();
	}
}
