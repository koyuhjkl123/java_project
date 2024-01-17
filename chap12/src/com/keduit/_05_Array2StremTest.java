package com.keduit;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Array2StremTest {

	public static void main(String[] args) {
		
		int[] ia = {2, 3, 5, 7, 8, 11};
		
//		stream매개변수로 ia을 넣고 int 타입인 IntStream is가 만들어진다
		IntStream is = Arrays.stream(ia);
		is.forEach(x -> System.out.print(x + " "));
//		System.out.println(is); // 주소값 나온다.
//		값을 나오게 할려면 연산을 해야한다.
		System.out.println();
		
		String[] sa = {"The", "pen", "is", "mighter", "than", "the"
				,"sword"};
		Stream<String> ss = Stream.of(sa);
		ss.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		double[] da = {1.2, 2.5, 3.6};
//		실수형 배열을 통해 DoubleStream으로 대입
		DoubleStream ds = DoubleStream.of(da);
		ds.forEach(x -> System.out.print(x + " "));

	}

}
