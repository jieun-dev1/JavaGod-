package Chapter13;

public class MemberDto {
	public String name;
	public String phone;
	public String email;

	public MemberDto(String name) {
		this.name = name;
	}

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Name=" + name + "Phone=" + phone + "Email=" + email;
	}
}
