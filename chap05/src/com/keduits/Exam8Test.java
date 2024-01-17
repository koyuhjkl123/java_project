package com.keduits;

import java.util.Scanner;

public class Exam8Test {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		입력값을 대문자로 변경 후 Putday 대입
        String PutDay = in.next().toUpperCase();

//      enum Exam8 상수 값인 String 값을 가져온다 
        Exam8 day = Exam8.valueOf(PutDay);

        switch (day) {
            case MONDAY:
                System.out.println("월요일은 " + day);
                break;
            case TUESDAY:
            case WEDESDAY:
            case THURSDAY:
                System.out.println("화,수,목요일은 " + day.toString());
                break;
            case FRIDAY:
                System.out.println("금요일은 " + day.toString() );
                break;
            case SATURDAY:
                System.out.println("토요일은 " + day.toString());
                break;
            case SUNDAY:
                System.out.println("일요일은 " + day.toString());
                break;
            default:
                System.out.println("알 수 없는 요일입니다.");
                break;
        }
    }
}