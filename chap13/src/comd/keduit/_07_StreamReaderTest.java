package comd.keduit;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class _07_StreamReaderTest {

	public static void main(String[] args) {

		String input = "D:\\Temp\\org.txt";

		try (FileInputStream fi = new FileInputStream(input);
				InputStreamReader in = new InputStreamReader(fi, "UTF-8")) {
			
			int c;
			System.out.println(in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
