package Chapter08;

public class ManageStudent {
	public static void main(String[] args) {
		Student student[] = null; // student 배열 생성. Student[] student = null(x)
		ManageStudent sample = new ManageStudent();
		student = sample.addStudent(); // addStudent에서 student의 데이터를 넣는 작업. student[]타입으로 반환.
		sample.printStudents(student);
	}

	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "010000", "ask@godofjava.com");
		return student;
	}

	public void printStudents(Student[] student) { // String[]이 아닌, Student[]
		for (Student data : student) {
			System.out.println("data is " + data);
		}
	}
}
