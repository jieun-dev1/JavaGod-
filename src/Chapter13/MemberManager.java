package Chapter13;

public interface MemberManager {

	public boolean addMember(MemberDto member);

	public boolean removeMember(String name, String phone);

	public boolean updateMember(MemberDto member);

}
