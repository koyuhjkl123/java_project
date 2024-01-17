package com.keduits;

public class Exam04_Echoer extends Thread {

	String msg;
	Exam04_Echo echo;

	public Exam04_Echoer(Exam04_Echo echo, String msg) {
		this.echo = echo;
		this.msg = msg;
	}

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				echo.echo(msg);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		
	}

}
