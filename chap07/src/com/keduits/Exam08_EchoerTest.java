package com.keduits;

import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("시작합니다.");
	}

	abstract void echo();

	void stop() {
		System.out.println("종료합니다.");
	}
}

public class Exam08_EchoerTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Echoer e = new Echoer() {
			@Override
			void echo() {
				String test = "";
//				입력한 값이 "끝"이 아니라면 입력한 값이 계속 출력
//				입력한 값이 "끝"이 라면 종료
				while (!(test.equals("끝"))) {
					test = in.nextLine();
					System.out.println(test);
				}
			}
		};
		e.start();
		e.echo();
		e.stop();
	}

}
