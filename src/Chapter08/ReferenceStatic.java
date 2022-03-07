package Chapter08;

public class ReferenceStatic {
	public static void main(String args[]) {
//		ReferenceStatic.staticMethod();
//		ReferenceStatic rs = new ReferenceStatic(); 
		String name = "min"; // 인스턴스 변수이기 때문에 static method에서도 사용될 수 없다.
//		rs.staticMethod();
	}

	public void staticMethod() {
		System.out.println(name);
	}
}
