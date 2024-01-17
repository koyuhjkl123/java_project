package com.test;
import java.util.Random;

public class Randoms {
	  private static final int LOTTO_SIZE = 6; // 로또 번호 개수
	    private static String[] lottoNumbers; // 로또 번호를 담을 배열

	    public static String[] generateLottoNumbers() {
	        Random random = new Random();
	        lottoNumbers = new String[LOTTO_SIZE];
	        for (int i = 0; i < LOTTO_SIZE; i++) {
	            lottoNumbers[i] = String.valueOf(random.nextInt(45) + 1); // 1부터 45까지의 숫자를 랜덤으로 생성하여 저장
	        }
	        return lottoNumbers; // 생성된 로또 번호 배열 반환
	    }

	    public static boolean checkWinning(String[] userNumbers) {
	        if (userNumbers.length != LOTTO_SIZE) {
	            System.out.println("로또 번호는 6개여야 합니다.");
	            return false;
	        }

	        int count = 0;
	        for (String number : userNumbers) {
	            if (containsNumber(number)) {
	                count++;
	            }
	        }

	        if (count == LOTTO_SIZE) {
	            System.out.println("로또 당첨!");
	            return true;
	        } else {
	            System.out.println("아쉽지만 다음 기회에!");
	            return false;
	        }
	    }

	    private static boolean containsNumber(String number) {
	        for (String lottoNumber : lottoNumbers) {
	            if (number.equals(lottoNumber)) {
	                return true;
	            }
	        }
	        return false;
	    } 
}
	
	
	
	
	
