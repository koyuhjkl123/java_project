package comd.keduit;

import java.io.BufferedReader;
import java.io.FileReader;

public class _06_BuffedrReaderTest {

	public static void main(String[] args) {
		
		
		try(
				BufferedReader br = new BufferedReader(new FileReader(
						"D:\\Temp\\org.txt"));){
			
			br.lines().forEach(s-> System.out.println(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
