package Chapter08;

public class MemberDto {
	public String name;
	public String phone;
	public String email;

	public MemberDto() {
		// �ƹ� ������ �� ��
	}

	public MemberDto(String name) {
		this.name = name;
	}

	public MemberDto(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public MemberDto(String name, String phone, String email) {
		// ��� ������ �� ��

		this.name = name;
		this.phone = phone;
		this.email = email;
	}

}
