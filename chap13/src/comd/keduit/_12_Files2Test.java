package comd.keduit;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _12_Files2Test {

	public static void main(String[] args) throws IOException {
		
		Charset cs = Charset.defaultCharset();
		
		Path p = new File("D:\\Temp\\number.txt").toPath();
		
		if(Files.notExists(p)) {
			Files.createFile(p);
		}
		
		byte[] data = "9\n8\n1\n4\n6".getBytes();
		
		Files.write(p, data, StandardOpenOption.APPEND);
		

	}

}
