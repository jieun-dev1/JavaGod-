package Chapter13;

public abstract class MemberManagerAbstract {
	public abstract boolean addMember(MemberDto member);

	public abstract boolean removeMember(String name, String phone);

	public abstract boolean updateMember(MemberDto member);

	public void printLog(String data) {
		System.out.println("Data=" + data);
	}
}
