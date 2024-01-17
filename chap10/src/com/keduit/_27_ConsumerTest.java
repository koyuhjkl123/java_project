package com.keduit;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class _27_ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
		c1.accept("Java Function Interface");
		
		BiConsumer<String, String> c2 = (x,y) -> System.out.println(x+":" + y);
		c2.accept("Java", "Lambda");
		
		ObjIntConsumer<String> c3 = (x,y) ->{
			int a = Integer.parseInt(x) + y;
			System.out.println(a);
		};
		
		c3.accept("500", 5);
		
		IntConsumer c4 = x -> System.out.printf("%d * %d = %d\n", x,x,x*x);
		c4.accept(50);
		IntConsumer c5 = c4.andThen(x -> System.out.printf("%d + 10 = %d"
				, x,x+10));
		c5.accept(10);
	}

}
