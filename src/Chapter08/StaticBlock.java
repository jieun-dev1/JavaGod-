package Chapter08;

public class StaticBlock {
	static int data = 1;

	public StaticBlock() {
		System.out.println("StaticBlock constructor");
	}

	static {
		System.out.println("*** First Static block. ***");
		data = 3;
	}

	static {
		System.out.println("*** Second static block. ***");
		data = 5;
	}

	public static int getData() {
		return data;
	}
}
