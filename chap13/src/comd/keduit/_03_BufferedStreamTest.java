package comd.keduit;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_BufferedStreamTest {

	public static void main(String[] args) {

		long start, end, duration;
		String org = "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";

		String dst = "D:\\Temp\\iexplore1.exe";

		start = System.nanoTime();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(org));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dst));) {
			while (bis.available() > 0) {
				int b = bis.read();
				bos.write(b);
			}
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		end = System.nanoTime();
		System.out.println("버퍼를 사용한 파일 카피 : " + (end - start));

		start = System.nanoTime();
		try (FileInputStream fis = new FileInputStream(org); 
				FileOutputStream fos = new FileOutputStream(dst);) {
			while (fis.available() > 0) {
				int b = fis.read();
				fos.write(b);
			}
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		System.out.println("버퍼를 사용하지 않은 파일 카피 : " + (end - start));
	}

}
