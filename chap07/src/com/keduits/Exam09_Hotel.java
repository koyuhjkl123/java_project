package com.keduits;

public class Exam09_Hotel {
	int index; // 객실 방 번호
	String name; // 고객 이름

	public class Room { // 객실를 위한 방 클래스이자 중첩클래스
		String[] names = new String[10]; // 객실 10개의 방

		void addRoom(int index, String name) { // 객실 예약 순서 1-1번
				names[index - 1] = name;
				names[Exam09_Hotel.this.index -1 ] = Exam09_Hotel.this.name;
				// hotel.add(5, "호돌이");
		}

		void addshow() {// 객실 예약 현황 출력
			for (int i = 0; i < names.length; i++) {
				if (names[i] != null) {
					// i번째 번지에 null이 아니라면 예약된 방
					// null이라면 예약되지 않는 방
					System.out.printf("%d번 방을 %s가 예약했습니다.\n", i + 1, names[i]);
				}
			}

		}
	}

//	Room 내부클래스에 있는 메소드를 출력하기위해 객체 생성
	Room rooms = new Room();
//
	void add(int index, String name) {// hotel.add(5, "호돌이");
		this.index = index;
		this.name = name;
		rooms.addRoom(index, name); 
	}

	void show() {
		rooms.addshow();
	}

}
