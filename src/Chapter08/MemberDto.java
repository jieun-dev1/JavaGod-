package Chapter08;

public class MemberDto {
	public String name;
	public String phone;
	public String email;

	public MemberDto() {
		// 아무 정보도 모를 때
	}

	public MemberDto(String name) {
		this.name = name;
	}

	public MemberDto(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public MemberDto(String name, String phone, String email) {
		// 모든 정보를 알 때

		this.name = name;
		this.phone = phone;
		this.email = email;
	}

}
