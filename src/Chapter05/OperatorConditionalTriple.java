package Chapter05;

public class OperatorConditionalTriple {
	public boolean doBlindDate(int point) {
		boolean doBlindDateFlag = false;
		doBlindDateFlag = (point >= 80) ? true : false;
		System.out.println(point + " : " + doBlindDateFlag);
		return doBlindDateFlag;
	}

	public static void main(String[] args) {
		OperatorConditionalTriple operator = new OperatorConditionalTriple();
		operator.doBlindDate(30);
		operator.doBlindDate(80);
	}
}
