package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class dosi {
	Scanner scanner = new Scanner(System.in);
	Set<String> gyeong_count; // 필드
	String[] city = { "포항", "구미", "경산", "경주", "안동", "김천", "영주", "상주", "영천", "문경" };
	String[] county = { "칠곡", "의성", "울진", "예천", "청도", "성주", "영덕", "고령", "봉화", "청송", "군위", "영양", "울릉" };

	String[] city_eng = { "Pohang", "Gumi", "Gyeongsan", "Gyeongju", "Andong", "Gimcheon", "Yeongju", "Sangju",
			"Yeongcheon", "Mungyeong" };
	String[] county_eng = { "Chilgok", "Uiseong", "Uljin", "Yecheon", "Cheongdo", "Seongju", "Yeongdeok", "Goryeong",
			"Bonghwa", "Cheongsong", "Gunwi", "Yeongyang", "Ulleung" };
	static String[] count = { "", "", "", "", "", "", "", "", "", "" };

	int count_start = 0; // 카운트 시작점
	int count_end = 10; // 카운트 마지막
	int sums = 0; // 총 점수 합계
	static int sums_count = 0; // 10번의 단어를 맞추기 위한 카운트

	public dosi(Set<String> gyeong_count) {
		this.gyeong_count = gyeong_count;

		List<String> gyeong1 = new ArrayList<String>(); // 경북 도시명
		List<String> gyeong2 = new ArrayList<String>(); // 경북 군

		List<String> gyeong_random = new ArrayList<String>(Arrays.asList(city_eng));

//		경북 시 한글, 영문 이름들이 들어가 있음
		for (int i = 0; i < city_eng.length; i++) {
			gyeong1.add(city[i]);
			gyeong1.add(city_eng[i]);
		}

//		경북 군 한글, 영문 이름들이 들어가 있음
		for (int i = 0; i < county_eng.length; i++) {
			gyeong2.add(county[i]);
			gyeong2.add(county_eng[i]);
		}
//		모든 경북 영문 키워드가 들어가 있다.
		for (int i = 0; i < county_eng.length; i++) {
			gyeong_random.add(county_eng[i]);
		}
		

		while (true) {
			gyeong_count.add(gyeong_random.get((int) (Math.random() * gyeong_random.size())));
			if (gyeong_count.size() == 10) {
				break;
			}
		}

	}

	public void stringBuilders() {
		count = gyeong_count.toArray(new String[10]);
		int c = 0;

		StringBuilder names_m = new StringBuilder("-".repeat(count[0].length()));

		while (true) {
			System.out.println("경북 도시명, 군 영어 단어를 입력하세요 : ");
			if (sums_count > 0) {
				System.out.printf("경북 단어가 새롭게 변경되었습니다. \n%d번 변경", sums_count);
			}
			System.out.println("단어 : " + names_m);
			char ch = scanner.next().charAt(0);

			if (count_start < count_end) {
//				값을 찾기 위한
				boolean isFound = string_Count(names_m, sums_count, ch);

				if (isFound) {
					System.out.println("맞추신 단어 : " + names_m);
					System.out.printf("정확한 단어를 맞추셧습니다. %d번 더 기회가 있어요!\n", count_end - count_start);
					count_start++;
				} else {
					System.out.println("맞추신 단어 : " + names_m);
					System.out.printf("잘못된 단어입니다. %d번 기회가 남음\n", count_end - count_start);
					count_start++;
				}

//				모든 문자를 맞춰는지 확인한 후 게임 진행여부 결정한다
				if (names_m.toString().equals(count[sums_count])) {
					System.out.println("모두 맞추셨습니다.");
					sums += 10; // 모두 맞출 경우 10점을 부여
					sums_count++; // 새로운 단어를 뽑기 위해 카운트
					count_start = 0; // 새로운단어를 위한 초기화
					if (sums_count == 10) {
						System.out.printf("총 점수 : %d점 입니다.", sums_count);
						break;
					}
					stringFound(names_m);
				}
			} else {
				System.out.printf("%d번를 모두 사용하셨습니다.\n", count_start);
				count_start = 0;
				sums_count++;
				stringFound(names_m);
			}
		}

	}

	public boolean string_Count(StringBuilder ss, int counts, char s) {

		String currenWord = count[counts]; // 현재 맞춰야 할 단어
		boolean letterFound = false; // 입력된 문자가 단어에 포함되었는지 여부

//		무작위로 뽑힌 문자열과 입력한 문자와 일치 하는지
		for (int i = 0; i < currenWord.length(); i++) {
			if (currenWord.charAt(i) == s) {
				ss.setCharAt(i, s); // 입력된 문자를 단어에 추가
				letterFound = true;
			}
		}

		return letterFound;
	}

	public StringBuilder stringFound(StringBuilder ss) {

//		작업이 완료 되면 새로운 문자열 값이 갱신된다.
		ss = new StringBuilder("-".repeat(count[sums_count].length()));
		return ss;
	}
	

}
