package comd.keduit;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class _14_Stream1Test {

	public static void main(String[] args) {

		File file = new File("C:\\Windows");

		File[] fs = file.listFiles();

		Stream<File> stream = Arrays.stream(fs);

		long count = stream.filter(x -> x.isDirectory() == false).count();
		System.out.println("C:/Windows에 있는 파일의 갯수 : " + count);
	}

}
