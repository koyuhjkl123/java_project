package com.keduits;

public class Exam04_Echo{
	
	String msg;
	
	public Exam04_Echo(String msg) {
		this.msg = msg;
	}
	
	public synchronized void echo(String msg) {
			for(int i=0; i < 1; i++) {
				System.out.println(msg);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
	}

}
