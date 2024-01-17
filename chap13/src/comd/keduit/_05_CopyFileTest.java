package comd.keduit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _05_CopyFileTest {

	public static void main(String[] args) {
		
		String input = "D:\\Temp\\org.txt";
		String output = "D:\\Temp\\dup2.txt";
		
		
		try(FileReader fr = new FileReader(input);
				FileWriter fw = new FileWriter(output);){
			
			int c;
			while ((c= fr.read()) != -1) {
				fw.write(c);
			}
		}catch (FileNotFoundException e) {
			e.getStackTrace();
		}catch (IOException e) {
			e.getStackTrace();
		}

	}

}
