package Chapter04;

public class PrimitiveTypes {
	public static void main(String[] args) {
		PrimitiveTypes types = new PrimitiveTypes();
		types.checkByte();
		types.checkChar();
	}

	public void checkByte() {
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println("byteMin " + byteMin);
		System.out.println("byteMax " + byteMax);

	}

	public void checkChar() {
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println("charMin=[ " + charMin + "]");
		System.out.println("charMax=[ " + charMax + "]");
		int intValue = 'a';
		System.out.println("intValue=[ " + intValue + "]");

	}
}
