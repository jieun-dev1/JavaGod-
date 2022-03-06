package Chapter06;

public class ControlFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlFor control = new ControlFor();
		control.forLoop(10);
	}

	public void forLoop(int until) {
		int sum = 0;
		for (int loop = 1; loop <= until; loop++) {
			sum += loop;
		}

	}

}
