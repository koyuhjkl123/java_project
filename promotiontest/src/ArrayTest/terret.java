package ArrayTest;

import java.util.Scanner;

public class terret {
	
//	java 문제
//	돌 게임은 두 명이서 즐기는 재밌는 게임이다.
//	탁자 위에 돌 N개가 있다. 상근이와 창영이는 턴을 번갈아가면서 돌을 가져가며, 
//	돌은 1개 또는 3개 가져갈 수 있다. 마지막 돌을 가져가는 사람이 게임을 이기게 된다.
//	두 사람이 완벽하게 게임을 했을 때, 이기는 사람을 구하는 프로그램을 작성하시오. 게임은 상근이가 먼저 시작한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		N개의 돌이기때문 입력을 해야한다.
		int stons = sc.nextInt();
		int stons_player =0;
//		상근이가 이기면 : SK
//		창영이가 이기면 : CY
		
		
		String player = "상근";
		
		
		while(stons > 0) {
			
//			 두사람은 완벽하게 게임을 가정했을 때, 
			if(stons % 4 == 0) {
				stons_player = 3;
			}else {
				stons_player = (stons % 4 == 2)? 1: stons % 4; // 4의 배수가 아니라면 1
			}
			stons -= stons_player; // 플레이어가 돌을 가져간 수를 빼서 저장
			
//			플레이어 변경
			player = player.equals("상근")? "창영":"상근";
			
		}
		
		if(stons == 0) {
			player = player.equals("상근")? "SK":"CY";
		}
		
		System.out.println("게임에 이긴 사람 : "+player);
		
		
		
		
		
		
		
		
		

	}

}
