package comd.keduit;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _02_CopyFileTest {

	public static void main(String[] args) {

		String input = "D:\\Temp\\org.txt";
		String output = "D:\\Temp\\dup.txt";
//		FileInputStream fis;
//		FileOutputStream fos;
		try (FileInputStream fis = new FileInputStream(input);
				FileOutputStream fos = new FileOutputStream(output)){
			
			int c;
			while((c = fis.read()) != -1) {
				System.out.print((char) c);
				fos.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
