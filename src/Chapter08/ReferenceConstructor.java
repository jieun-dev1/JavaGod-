package Chapter08;

public class ReferenceConstructor {
	public static void main(String[] args) {
		ReferenceConstructor reference = new ReferenceConstructor();
		reference.makeMemberObject();
	}

	public void makeMemberObject() {
		MemberDto dto1 = new MemberDto();
		MemberDto dto2 = new MemberDto("k");
		MemberDto dto3 = new MemberDto("k", "0100000");
		MemberDto dto4 = new MemberDto("k", "0100000", "k@naver.com");

	}
}
