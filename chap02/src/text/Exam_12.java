package text;

public class Exam_12 {

	public static void main(String[] args) {
		
		
		for(int a = 0; a <10; a++) {
			for(int b=0; b < 10; b++) {
				if((10*a+b)+(10*b+a) == 99) {
					System.out.printf("%d + %d = %d\n",(10*a+b),(10*b+a),99);
				}
			}
		}
		
		

	}

}
