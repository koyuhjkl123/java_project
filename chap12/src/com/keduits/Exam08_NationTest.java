package com.keduits;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.keduit.Nation;
import com.keduit.Type;

public class Exam08_NationTest {

	public static void main(String[] args) {
		
//		stream으로 생성
		Stream<Nation> list = Nation.nations.stream();

//		방법 1번 || Collectors.groupingBy(Nation::getType,Collectors.toMap()) 활용
		
//		Map<Type, Map<String, String>> map = list
////				Collectors.groupingBy : 첫번째 매개변수로 getType으로 LAND, ISLAND 그룹화 기준
//			    .collect(Collectors.groupingBy(
//			        Nation::getType,
////			        두번째 매개변수로 추가 처리
////			        문제에서 LAND, ISLAND 기준으로 그룹핑하고 각 그룹을 선진국, 개도국으로 분류
////			        Collectors.toMap : 첫번째 매개변수 : 키값을 선진국, 개도국
////			        GDP 12위 내 선진국, 13위 이상은 개도국
//			        Collectors.toMap(
//			            nation -> {
//			                if (nation.getGdpRank() <= 12) {
//			                    return "선진국";
//			                } else {
//			                    return "개도국";
//			                }
//			            },
////			            Collectors.toMap의 두번째 매개변수 : 키에 해당되는 값을 부여
////			            getName() 나라이름을 부여함
//			            nation -> nation.getName(),
////			            Collectors.toMap의 3번째 매개변수 : 병합함수 처리
////			            선진국, 개도국 키 값들이 중복, 12내위들은 전부 선진국이기때문에
////			            중복이 일어났는데 그걸 처리해주는 처리가 '병합함수'
////			            (x, y) : x : 처음에 존재하는 기존 값
////			            y : 두번째 변수, 기존 값의 중복 있을 시 대체 및 현재 값
////			            x  +"+"+ y : 기존 값과 현재값을 더해 새로운 값으로 만들어줌
//			            (x, y) -> x  +"+"+ y
//			        )
//			    ));
//		System.out.println(map);
		
//		방법 2번 // Collectors.groupingBy(Nation::getType, Collectors.groupingBy(,Collectors.mapping) 활용
		Map<Type, Map<String, List<String>>> map = list.collect(Collectors.groupingBy(
				Nation::getType, Collectors.groupingBy(t->{
//					첫번째 Type : Nation::getType 기준(LAND,ISLAND)
//					tomap :getType기준인 키값의 첫번째 키값 : 선진국, 개도국을 각 그룹화
					if(t.getGdpRank() <= 12) {
						return "선진국";
					}else {
						return "개도국";
					}
//				선진국, 개도국으로 그룹된 키값을 
//					Nation::getName 기준으로 value 값을 리스트 타입으로 추출
				}, Collectors.mapping(Nation::getName, Collectors.toList()))));
		System.out.println(map);
	}

}
