package com.keduits;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam03_doubleTest {

	public static void main(String[] args) throws IOException {
		
//		5개의 double 타입의 숫자로 구성된 배열을 사용해 다음 작업을 수행
		
		double[] db = {1.0, 2.0, 3.0, 4.0 ,5.0};
		String data = "D:\\Temp\\double.txt";
		
		DataOutputStream data_double = new DataOutputStream(new FileOutputStream(data));
		
		for(double value: db) {
			data_double.writeDouble(value);
		}
		data_double.close();
		
		DataInputStream input_data = new DataInputStream(new FileInputStream(data));
		
		for(int i=0; i < db.length; i++) {
			System.out.print(input_data.readDouble() + " ");
		}
	}

}
