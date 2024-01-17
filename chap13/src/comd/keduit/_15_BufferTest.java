package comd.keduit;

import java.nio.ByteBuffer;

public class _15_BufferTest {

	public static void main(String[] args) {
		
		ByteBuffer bb = ByteBuffer.allocate(10);
		
		System.out.println(bb);
		
		bb.put("ab".getBytes());
		
		System.out.println(bb);
		
		bb.put("cde".getBytes());
		System.out.println(bb);
		
		bb.flip(); // 현재 pos의 값을 lim 값으로 변경(pos는 초기화된다)
		System.out.println(bb);
		
		System.out.println(new String(bb.array()));
		
		bb.clear();
		System.out.println(bb);

		bb.put("fghi".getBytes());
		System.out.println(bb);
	}

}
