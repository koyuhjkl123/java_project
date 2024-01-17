package comd.keduit;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class _16_Channel1Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\org.txt");
		
		Path path =  Paths.get("D:\\Temp\\dup.txt");
		
		FileChannel org = fis.getChannel();
		FileChannel dup = FileChannel.open(path, StandardOpenOption.WRITE,
				StandardOpenOption.CREATE);
		
		ByteBuffer buf = ByteBuffer.allocate(10);
		
		while ((org.read(buf)) != -1) {
			System.out.println(buf);
			buf.flip();
			System.out.println(buf);
			dup.write(buf);
			buf.clear();
		}
		
		org.close();
		dup.close();

	}

}
