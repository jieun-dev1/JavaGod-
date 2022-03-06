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

	// continue 문: 그 뒤에 있는 문장은 건너 뛰고, "boolean 조건" 점검 부분 while(loop<12) 으로 다시 가라.
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
