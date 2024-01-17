package com.keduits;

public class Exam05_TimsIsMoney extends Thread {

	String names;
	String name_n;

	public Exam05_TimsIsMoney(String names, String name_n) {
		this.names = names;
		this.name_n = name_n;
	}

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				String[] name = names.split(" ");
				System.out.println(name_n + " : " + name[i]);

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				notify();
			}
		}
	}

	public String getNames() {
		return names;
	}

}
