package com.keduit;

import java.util.Optional;

public class _11_Optional2Test {

	public static void main(String[] args) {

//		String s = "안녕";
		String s = null;

		Optional<String> o = Optional.ofNullable(s);
		if (s != null) {
			Util.Print(s);
		} else {
			Util.Print("없음1");
		}

		if (o.isPresent()) {
			Util.Print(o.get());
		} else {
			Util.Print("없음2");
		}

		s = o.orElse("없음3");
		Util.Print(s);

		o.ifPresentOrElse(Util::Print, () -> System.out.println("없음4"));

	}

}
