package comd.keduit;

import java.io.File;

public class _09_FileTest {

	public static void main(String[] args) {
		
		File file = new File("C:\\Windows");
		File[] fa = file.listFiles();
		
		for(File f : fa) {
			if(f.isDirectory()) {
				System.out.printf("dir : %s%n", f);
			}else {
				System.out.printf("file : %s(%d bytes)%n",f, f.length());
			}
		}

	}

}
