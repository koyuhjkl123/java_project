package text;

public class Exam_11 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i+=2) {
			for (int x = 1; x < 10; x++) {
				System.out.printf("%d단 %d x %d\n", i, i, x);
				if (i == x) {
					break;
				}
			}

		}
	}
}
