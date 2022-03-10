package Chapter13;

public class InterfaceExample {

	// member의 타입은 MemberManager지만, 구현을 하기 위해서는 실제 메소드들이 구현되어 있는 MemberManagerImpl로
	// 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberManager member = new MemberManagerImpl();
	}

}
