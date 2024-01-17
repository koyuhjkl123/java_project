package com.keduits;

public class Exam04_EchoerTest {

	public static void main(String[] args) {

		Exam04_Echo e = new Exam04_Echo("자바");
		Exam04_Echoer ec1 = new Exam04_Echoer(e, "환영");
		Exam04_Echoer ec2 = new Exam04_Echoer(e, "야호~~~");

		ec1.start();
		ec2.start();
		synchronized (ec2) {
			for (int i = 0; i < 3; i++) {
				try {
					ec1.join();
					System.out.println("자바");
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}
		}

	}

}
