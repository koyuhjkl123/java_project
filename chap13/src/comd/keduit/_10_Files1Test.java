package comd.keduit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class _10_Files1Test {

	public static void main(String[] args) throws IOException {

		File f1 = new File("D:\\Temp\\org.txt");
		
		File f2 = new File("D:\\Temp");
		
		System.out.println("org.txt는 폴더인가?" + Files.isDirectory(f1.toPath()));
		
		System.out.println("Temp는 폴더인가? : " + Files.isDirectory(f2.toPath()));
		
		System.out.println("org.txt는 읽을 수 있는 파일인가? : " + 
		Files.isReadable(f1.toPath()));
		
		System.out.println("org.txt의 크기는? : " + Files.size(f1.toPath()));
	}

}
