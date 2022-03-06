package Chapter04;

public class ProfilePrint {
	byte age;
	String name;
	Boolean isMarried;

	public void setAge(byte paramAge) {
		age = paramAge;
	}

	public byte getAge() {
		return age;
	}

	public void setName(String paramName) {
		name = paramName;
	}

	public String getName() {
		return name;
	}

	public void setMarried(boolean flag) {
		isMarried = flag;
	}

	public Boolean isMarried() {
		return isMarried;
	}

	public static void main(String[] args) {
		ProfilePrint prof = new ProfilePrint();
		prof.setAge((byte) 10);
		prof.setName("jk");
		prof.setMarried((boolean) false);
		System.out.println("My age is " + prof.getAge());
		System.out.println("My Name is " + prof.getName());
		System.out.println("My Marriage is " + prof.isMarried());
	}
}
