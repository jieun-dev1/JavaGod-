package Chapter08;

public class ReferenceReturn {
	ReferenceReturn reference = new ReferenceReturn();

	public int intReturn() {
		int returnInt = 0;
		return returnInt;
//		returnInt++; //return �ڿ� statement �� ���� �ȵȴ� unreachable statement. 
	}

	public int[] intArrayReturn() {
		int returnArray[] = new int[10];
		return returnArray;
	}

	public String stringReturn() {
		String returnString = "Return value";
		return returnString;
	}

	public void wantToStopInTheMiddle(boolean flag) {
		if (flag)
			return;
	}
}
