package Chapter13;

public class FinalReferenceType {
	final MemberDto dto = new MemberDto();

	public static void main(String args[]) {
		FinalReferenceType referenceType = new FinalReferenceType();
		referenceType.checkDto();
	}

	public void checkDto() {
		System.out.println(dto);
//		dto = new MemberDto();
		dto.name = "Sangmin";
		System.out.println(dto);

	}
}
