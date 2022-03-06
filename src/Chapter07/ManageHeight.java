package Chapter07;

//배열을 전역으로 선언해줘야 함 (메서드 밖에서) 
public class ManageHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int classCnt=0;
//		int studentCnt=0;
//		int [][] grandHeights = new int[classCnt][studentCnt];
		ManageHeight manager = new ManageHeight();
		manager.setData();
		for (int classNo = 1; classNo <= 5; classNo++) {
//			manager.printHeight(classNo);
			manager.printAverage(classNo);
		}
	}

	int grandHeights[][];

	public void setData() {
		grandHeights = new int[5][];
		grandHeights[0] = new int[] { 170, 180, 173, 175, 177 };
		grandHeights[1] = new int[] { 160, 165, 167, 186 };
		grandHeights[2] = new int[] { 158, 177, 187, 176 };
		grandHeights[3] = new int[] { 173, 182, 181 };
		grandHeights[4] = new int[] { 170, 180, 165, 177, 172 };

	}

	public void printHeight(int classNo) {
		System.out.println("Class No." + classNo);
//		int arrayLen = grandHeights[classNo - 1].length;
		for (int data : grandHeights[classNo - 1]) {
			System.out.println(data);
		}
	}

	public void printAverage(int classNo) {
		double sum = 0;
		double average;
		int studentCount = grandHeights[classNo - 1].length;
		for (int data : grandHeights[classNo - 1]) {
			sum += data;
		}
		System.out.println(sum / studentCount);
	}

}
