package Chapter06;

public class ControlLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlLabel control = new ControlLabel();
		control.printTimeTable();
	}

	public void printTimeTable() {
		for (int level = 1; level < 10; level++) {
			if (level == 4)
				continue;
			for (int unit = 1; unit < 10; unit++) {
				if (unit == 4)
					break;
				System.out.println(level + "*" + unit + " = " + level * unit);
			}
			System.out.println();

		}
	}

}
