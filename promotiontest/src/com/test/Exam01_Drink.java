package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exam01_Drink {

//	음료는 아래의 정보를 갖는다.
//	이름, 가격

//	음료는 아래의 동작을 수행 할 수 있다.
//	음료 정보를 문자열로 반환

	String drink; // 음료 이름
	int price; // 음료 가격
	String[] dirnks; // 다양한 음료

	int drink_price;

	StringBuilder drink_data; // 정보를 출력하기위한 변수

	String add_drink; // 음료를 추가할 음료 정보를 저장
	String remove_drink; // 음료를 삭제할 음료 정보를 저장

	List<Exam01_Drink> drinks = new ArrayList<Exam01_Drink>();

	public Exam01_Drink() {
//		보유 음료 아메리카노, 라떼, 레몬에이드, 캔맥주
		drinks.add(new Exam01_Drink("아메리카노", 2000));
		drinks.add(new Exam01_Drink("라떼", 2500));
		drinks.add(new Exam01_Drink("레몬에이드", 3000));
		drinks.add(new Exam01_Drink("캔맥주", 3500));
	};
	public Exam01_Drink(String drink, int price) {
		this.drink = drink;
		this.price = price;
	}

	public String getDrinks() {
		return drink + "- " + price + "원\n";
	}

	public String getDrink() {
		return drink;
	}

	public int getPrice() {
		return price;
	}

//	음료를 추가
	public StringBuilder DrinkAdd(String drink, int price) {
		this.add_drink = drink;
		drink_price = price;
		StringBuilder ab = new StringBuilder();

		boolean isdrink = false; // 중복 여부 체크

		for (int i = 0; i < drinks.size(); i++) {
			if ((drinks.get(i).getDrink().equals(drink))) {
				isdrink = true; // 기존에 등록된 음료라면 true로 변경
				break; // 중복된 음료이면 반복문에서 빠져 나가기
			}
		}
		if (!isdrink) {
			drinks.add(new Exam01_Drink(drink, price)); // 기존에 등록된 음료가 없다면 등록
			drink_data = ab.append("==" + drink + "추가 ==\n\n"); // 음료가 추가 됬으면 문구 등록
		}
		return ab;
	}

//	등록된 음료를 삭제
	public StringBuilder DrinkRemove(String drink, int price) {
		remove_drink = drink;
		StringBuilder ab = new StringBuilder();

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).getDrink().equals(drink) && drinks.get(i).getPrice() == price) {
				drinks.remove(i);
				drink_data = ab.append("== " + drink + " 삭제 ==\n\n");
			}
		}
		return ab;
	}

	@Override
	public String toString() { // 책을 출력
		StringBuilder ab = new StringBuilder();
		

//		책, 음료 각 추가 및 삭제에 대한 정보가 없으면 기존 정보 출력
		if ((add_drink == null && remove_drink == null)) {
			ab.append("== 카페 정보 ==\n");
		} else if ((add_drink != null && remove_drink == null)) {
			ab.append(drink_data); // 음료 추가
			ab.append("== 카페 정보 ==\n");
			add_drink = null;
		} else if ((add_drink == null && remove_drink != null)) {
			ab.append(drink_data); // 음료 삭제
			ab.append("== 카페 정보 ==\n");
		}

		ab.append(String.format("이름 : %s\n", "IT 카페")); // IT 카페
		ab.append(String.format("주소 : %s\n", "신림역 3번 출구")); // 신림역 3번 출구
		ab.append("판매 음료: \n");
		drinks.forEach(drink -> ab.append(drink.getDrinks()));
		return ab.toString();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Exam01_Drink other = (Exam01_Drink) obj;
		return price == other.price && Objects.equals(drink, other.drink);
	}

	// hashCode() 메서드도 오버라이드하는 것이 좋습니다.
	@Override
	public int hashCode() {
		return Objects.hash(drink, price);
	}
}
