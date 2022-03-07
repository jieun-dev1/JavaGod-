package Chapter08;

public class ReferencePass {
	public static void main(String[] args) {
		ReferencePass reference = new ReferencePass();
		reference.callPassByReference();
	}

	public void callPassByReference() {
		MemberDto member = new MemberDto("Sangmin");
		System.out.println("before passByReference");
		System.out.println("member.name=" + member.name);
		passByReference(member);
		System.out.println("after passByReference");
		System.out.println("member.name=" + member.name);
	}

	public void passByReference(MemberDto member) {
		member.name = "SungChoon";
		System.out.println("in passByReference");
		System.out.println("member.name=" + member.name);

	}
}
