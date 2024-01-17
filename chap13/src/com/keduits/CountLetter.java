package com.keduits;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CountLetter {

	int lookFor;
	String fileName;
	int count;
	
	public CountLetter(int lookFor, String fileName) throws IOException {
		this.lookFor = lookFor;
		this.fileName = fileName;
		
		
		try {
			DataOutputStream dd = new DataOutputStream(new FileOutputStream(fileName));
			
			dd.writeChars("abcdefefaesdease");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int count() throws IOException {
		String name;
		try {
			DataInputStream dt = new DataInputStream(new FileInputStream(fileName));
			name = dt.readLine();
			
			for(int i=0; i < name.length(); i++) {
				
				if(name.charAt(i) == lookFor) {
					count++;
				}
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return count;
	}
	
}
