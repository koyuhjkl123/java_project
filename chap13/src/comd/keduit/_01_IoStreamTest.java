package comd.keduit;

import java.io.IOException;

public class _01_IoStreamTest {

	public static void main(String[] args) throws IOException {
		
		int len = 0;
		int ba[] = new int[100];
		int b = 0;
		
		System.out.println("----- 입력스트림 -----");
		while((b = System.in.read()) != '\n') {
			System.out.printf("%c(%d)", (char)b, b);
			
			ba[len++] = b;
		}
		
		System.out.println("----- 출력스트림 -----");
		
		for(int i=0; i <len; i++) {
			System.out.write(ba[i]);
		}
		System.out.flush();
	}

}
