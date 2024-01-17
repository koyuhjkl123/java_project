package comd.keduit;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _04_DataStreamTest {

	public static void main(String[] args) {
		
		try(
				DataOutputStream dos = new DataOutputStream(
						new FileOutputStream("D:\\Temp\\data.dat"));
				DataInputStream dis = new DataInputStream(
						new FileInputStream("D:\\Temp\\data.dat"));
				){
			
			dos.writeDouble(10.1); // 1
			dos.writeInt(1004); // 2
			dos.writeUTF("Hello"); // 3
			dos.flush();
			
//			순서가 중요함 순서가 있게 
			System.out.println(dis.readDouble()); // 1
			System.out.println(dis.readInt()); // 2
			System.out.println(dis.readUTF()); // 3
		}catch (Exception e) {}
		

	}

}
