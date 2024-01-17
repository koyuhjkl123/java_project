package comd.keduit;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class _17_Channel2Test {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("D:\\Temp\\data.txt");
		
		FileChannel fc = FileChannel.open(p,StandardOpenOption.READ,
				StandardOpenOption.WRITE, StandardOpenOption.CREATE);
		
		
		ByteBuffer bb = ByteBuffer.allocate(1024);
		String s = "느낌이, 좋은\n Birds of a feather flock toghter.\n인생은 아름다워\nTime is Money";
		
		bb.put(s.getBytes());
		System.out.println(bb);
		bb.flip();
		
		int count = fc.write(bb);
		System.out.println("파일에 " + count + "바이트 기록");
		bb.clear();
		
		fc.read(bb);
		System.out.println(new String(bb.array()));
		
		fc.close();

	}

}
