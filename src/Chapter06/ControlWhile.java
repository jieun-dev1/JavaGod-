package Chapter06;

public class ControlWhile {
	public static void main(String[] args) {
		ControlWhile control = new ControlWhile();
		control.whileLoop1();
		control.whileBreak();
		control.whileContinue();

	}

	public void whileLoop1() {
		ControlOfFlow control = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalender(loop);

		}
	}

	public void whileBreak() {
		ControlOfFlow control = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalender(loop);
			if (loop == 6)
				break;
		}
	}

	// continue ��: �� �ڿ� �ִ� ������ �ǳ� �ٰ�, "boolean ����" ���� �κ� while(loop<12) ���� �ٽ� ����.
	public void whileContinue() {
		ControlOfFlow control = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			if (loop == 6)
				continue;
			control.switchCalender(loop);

		}
	}
}
