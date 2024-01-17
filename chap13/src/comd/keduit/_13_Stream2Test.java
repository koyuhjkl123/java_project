package comd.keduit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class _13_Stream2Test {

	public static void main(String[] args) throws IOException {

		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		Path p = new File("D:\\Temp\\number.txt").toPath();

		Stream<String> s = Files.lines(p);

		s.forEach(x -> System.out.print(x + " "));
		
		s= Files.lines(p);
		
		s.map(x -> number[Integer.parseInt(x)]).
		forEach(x-> System.out.print(x + " "));
	}

}
