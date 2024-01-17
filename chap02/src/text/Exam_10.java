package text;

public class Exam_10 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i <= 99; i++) {
			while(i % 2 ==0 && i % 7 ==0) {
				sum += i;
				
				break;
			}
		}
		System.out.println("100이하 자연수 중에서 2의 배수이자 7의 배수인 수 총 합: " + sum);

	}

}
