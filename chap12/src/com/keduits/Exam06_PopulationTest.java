package com.keduits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam06_PopulationTest {

	public static void main(String[] args) {
		
		List<String> list_String = new ArrayList<>(Arrays.asList(
				"서울", "워싱턴", "베이징", "파리", "마드리드", "런던"));

		List<Double> list_Double = new ArrayList<>(Arrays.asList(
				973.3, 63.2, 2115.0, 224.4, 326.5, 853.9));
		
//		2개의 리스트를 포함하기 위해 List(Exam06_Population)의 s1 변수를 생성
		List<Exam06_Population> s1 = new ArrayList<>();
		
//		list_String 크기 만큼 반복하여 빈 리스트인 s1에게 추가
//		new 생성자를 해서 값들을 add한다.
		for(int i=0; i < list_String.size(); i++) {
			s1.add(new Exam06_Population(list_String.get(i), list_Double.get(i)));
		}
		
//		문제에서 2개의 리스트로 Stream<Exam06_Population> 생성
//		2개의 리스트로 포함된 s1을 stream()해서 list 변수에 담는다.
		Stream<Exam06_Population> list = s1.stream();
		
//		키 : 한글 도시 문자열(String),  값 : 해당 도시 인구수(Double)
//		filter : getPopulation의 도시 인구수 값이 300.0보다 큰 값만 추출
		Map<String, Double> st2 = list.filter(x -> x.getPopulation() > 300.0)
//		toMap : 첫번째 매개변수 : 키 값(Exam06_Population::getCapital), 두번째 매개변수 : 키에 해당되는 값 (Exam06_Population::getPopulation)
				.collect(Collectors.toMap(Exam06_Population::getCapital, Exam06_Population::getPopulation));
//		출력 결과 : {서울=973.3, 마드리드=326.5, 베이징=2115.0, 런던=853.9}
//		System.out.println(st2);
		
//		출력이 Map형식으로 나오기 때문에 원하는 출력 결과를 나오기 위해서는
//		forEach를 활용하여 출력 형태를 맞게 사용함
		st2.forEach((k,v)-> System.out.println(k+"("+v+")"));
	}
	

}
