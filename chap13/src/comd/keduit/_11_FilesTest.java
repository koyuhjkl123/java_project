package comd.keduit;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class _11_FilesTest {

	public static void main(String[] args) throws IOException {
		
//		UTF-8
		Charset cs = Charset.defaultCharset();
		
		System.out.println(cs);
		Path p = new File("D:\\Temp\\new.txt").toPath();
		Path p2 = new File("D:\\Temp\\number.txt").toPath();
		
		if(Files.notExists(p)) {
			Files.createFile(p); // Exception 오류 나옴
		}
		
		byte[] data = "좋은 생각\n좋은 하루!\n".getBytes();
		
		Files.write(p, data, StandardOpenOption.APPEND);
		
		try {
			List<String> lines = Files.readAllLines(p, cs);
			
			for(String s: lines) {
				System.out.println(s);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
