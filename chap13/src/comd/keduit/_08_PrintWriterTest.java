package comd.keduit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class _08_PrintWriterTest {

	public static void main(String[] args) {
		
		String input = "D:\\Temp\\org.txt";
		
		String output = "D:\\Temp\\dup3.txt";
		
		try(BufferedReader br = new BufferedReader(
				new FileReader(input));
				PrintWriter pr = new PrintWriter(output);
				){
			
			br.lines().forEach(x -> pr.print(x));
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
