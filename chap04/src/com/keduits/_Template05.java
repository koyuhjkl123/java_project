package com.keduits;

public class _Template05 {

	public static void main(String[] args) {
		
//		
		int sum =0;
		
		for(int i=1; i <= 20; i++) {
			for(int j=1; j <= 20; j++) {
				
				sum = (i*i) + (j*j);
				int sums = (int)Math.sqrt(sum);
				if(sum == (sums*sums) && sums <= 20 ) {
					
					System.out.printf("x = %d, y = %d, 합 = %d\n", i,j, sums);
				}
			}
		}
		

	}

}
